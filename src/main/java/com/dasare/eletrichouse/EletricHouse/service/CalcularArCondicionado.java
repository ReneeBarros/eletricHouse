package com.dasare.eletrichouse.EletricHouse.service;

import org.springframework.stereotype.Service;

/*
CLASSE PARA CALCULAR BTUS POR AMBIENTE.
CONSIDERAÇOES:
    SE O AMBIENTE TIVER INSIDENTE DE RAIO SOLAR ACRRESCENTA 800BTUS POR METRO QUADRADO.

    Para cada metro quadrado, multiplica-se por 600 BTUs;

    Cada pessoa adicional soma 600 BTUs (a primeira pessoa não é contabilizada);

    Cada equipamento eletrônico soma 600 BTUs.

 */

@Service
public class CalcularArCondicionado implements BtusAmbiente {

    private CalculosComum comunCal;
    private Integer quantPessoasAmbiente;
    private Integer quantEletrodomestico;
    private Integer btuPorM2;
    private Integer btuAdicionalPorPessoa;
    private Integer btuAdicionalPorEletronico;
    private Integer btuAdicionalInsidenciaRaioSolar;
    private Integer btusTotal;
    private Boolean insidenciaRaioSolar;
    private String  cuva;
    private Double IDRS;
    private Double potenciaEletria;

    public CalcularArCondicionado(
            CalculosComum comunCal, Integer quantPessoasAmbiente,
            Integer quantEletrodomestico, Boolean insidenciaRaioSolar) {

        this.comunCal = comunCal;
        this.quantPessoasAmbiente = quantPessoasAmbiente;
        this.quantEletrodomestico = quantEletrodomestico;
        this.btuPorM2 = BTUS_POR_METRO_QUADRADO;
        this.btuAdicionalPorPessoa = BTUS_ADICIONAL_POR_PESSOA;
        this.btuAdicionalPorEletronico = BTUS_ADICIONAL_POR_ELETRONICO;
        this.btuAdicionalInsidenciaRaioSolar = BTUS_ADICIONAL_POR_INCIDENCIA_SOLAR;
        this.insidenciaRaioSolar = insidenciaRaioSolar;
        this.cuva = CuvaDisjuntores.CURVA_DISJUNTOR_TIPO_C.getCuva();
        this.IDRS = 5.50;
    }
    private void calcularBtus() {
        int _btusTotal = (int) (comunCal.areaCalculate() * btuPorM2);
        int _totalBtusPessoasAmbiente = 0;
        int _totalBtusEletronicosBtus = 0;
        Integer _btuInsidenciaderaioSolar = 0;

        if(this.quantPessoasAmbiente > 1){
           _totalBtusPessoasAmbiente = this.btuAdicionalPorPessoa * (this.quantPessoasAmbiente - 1);
        }
        if (this.quantEletrodomestico >= 1){
            _totalBtusEletronicosBtus = this.quantEletrodomestico * this.btuAdicionalPorEletronico;
        }
        if(this.insidenciaRaioSolar){
            _btuInsidenciaderaioSolar = this.btuAdicionalInsidenciaRaioSolar;
        }
        this.btusTotal = (_btusTotal + _totalBtusPessoasAmbiente + _totalBtusEletronicosBtus + _btuInsidenciaderaioSolar);
    }

    private void calculoPotenciaEletrica(){
        final Double k_constante = 0.293;
        this.potenciaEletria = ((this.btusTotal * k_constante) / IDRS);
    }

    public CalculosComum getComunCal() {
        return comunCal;
    }

    public void setComunCal(CalculosComum comunCal) {
        this.comunCal = comunCal;
    }

    public Integer getQuantPessoasAmbiente() {
        return quantPessoasAmbiente;
    }

    public void setQuantPessoasAmbiente(Integer quantPessoasAmbiente) {
        this.quantPessoasAmbiente = quantPessoasAmbiente;
    }

    public Integer getQuantEletrodomestico() {
        return quantEletrodomestico;
    }

    public void setQuantEletrodomestico(Integer quantEletrodomestico) {
        this.quantEletrodomestico = quantEletrodomestico;
    }

    public Integer getBtuPorM2() {
        return btuPorM2;
    }

    public void setBtuPorM2(Integer btuPorM2) {
        this.btuPorM2 = btuPorM2;
    }

    public Integer getBtuAdicionalPorPessoa() {
        return btuAdicionalPorPessoa;
    }

    public void setBtuAdicionalPorPessoa(Integer btuAdicionalPorPessoa) {
        this.btuAdicionalPorPessoa = btuAdicionalPorPessoa;
    }

    public Integer getBtuAdicionalPorEletronico() {
        return btuAdicionalPorEletronico;
    }

    public void setBtuAdicionalPorEletronico(Integer btuAdicionalPorEletronico) {
        this.btuAdicionalPorEletronico = btuAdicionalPorEletronico;
    }

    public Integer getBtuAdicionalInsidenciaRaioSolar() {
        return btuAdicionalInsidenciaRaioSolar;
    }

    public void setBtuAdicionalInsidenciaRaioSolar(Integer btuAdicionalInsidenciaRaioSolar) {
        this.btuAdicionalInsidenciaRaioSolar = btuAdicionalInsidenciaRaioSolar;
    }

    public Integer getBtusTotal() {
        return btusTotal;
    }

    public Boolean getInsidenciaRaioSolar() {
        return insidenciaRaioSolar;
    }

    public void setInsidenciaRaioSolar(Boolean insidenciaRaioSolar) {
        this.insidenciaRaioSolar = insidenciaRaioSolar;
    }

    public String getCuva() {
        return cuva;
    }


    public Double getIDRS() {
        return IDRS;
    }

    public void setIDRS(Double IDRS) {
        this.IDRS = IDRS;
    }

    public Double getPotenciaEletria() {
        return potenciaEletria;
    }

}