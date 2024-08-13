package com.dasare.eletrichouse.EletricHouse.model.calculo;


/*
CLASSE PARA CALCULAR BTUS POR AMBIENTE.
CONSIDERAÇOES:
    SE O AMBIENTE TIVER INSIDENTE DE RAIO SOLAR ACRRESCENTA 800BTUS POR METRO QUADRADO.

    Para cada metro quadrado, multiplica-se por 600 BTUs;

    Cada pessoa adicional soma 600 BTUs (a primeira pessoa não é contabilizada);

    Cada equipamento eletrônico soma 600 BTUs.

 */

import com.dasare.eletrichouse.EletricHouse.model.calculo.intefaceConstantes.BtusAmbiente;

public class CalcularArCondicionado extends CalculosComum implements BtusAmbiente {

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
    private Double amperagemCircuitoAc;

    public CalcularArCondicionado(
            Double largura, Double comprimento, Integer tensao,
         Integer quantPessoasAmbiente,
        Integer quantEletrodomestico, Boolean insidenciaRaioSolar) {

        super(largura,comprimento,tensao);
        this.quantPessoasAmbiente = quantPessoasAmbiente;
        this.quantEletrodomestico = quantEletrodomestico;
        this.btuPorM2 = BTUS_POR_METRO_QUADRADO;
        this.btuAdicionalPorPessoa = 0;
        this.btuAdicionalPorEletronico = 0;
        this.btuAdicionalInsidenciaRaioSolar = 0;
        this.insidenciaRaioSolar = insidenciaRaioSolar;
        this.cuva = CuvaDisjuntores.CURVA_DISJUNTOR_TIPO_C.getCuva();
        this.IDRS = 5.50;

        calcularBtus();
        calcularPotenciaEletrica();
        calcularAmperagemAC();
    }
    private void calcularBtus() {
        int _btusTotal = (int) (calcularArea() * btuPorM2);
        int _totalBtusPessoasAmbiente = 0;
        int _totalBtusEletronicosBtus = 0;
        int _btuInsidenciaderaioSolar = 0;

        if(this.quantPessoasAmbiente > 1){
            this.btuAdicionalPorPessoa  = BTUS_ADICIONAL_POR_PESSOA * (this.quantPessoasAmbiente - 1);
        }
        if (this.quantEletrodomestico >= 1){
            this.btuAdicionalPorEletronico = BTUS_ADICIONAL_POR_ELETRONICO * this.quantEletrodomestico;
        }
        if(this.insidenciaRaioSolar){
            this.btuAdicionalInsidenciaRaioSolar = BTUS_ADICIONAL_POR_INCIDENCIA_SOLAR ;

        }
        this.btusTotal = (_btusTotal + this.btuAdicionalPorPessoa  + this.btuAdicionalPorEletronico + this.btuAdicionalInsidenciaRaioSolar);
    }

    private void calcularPotenciaEletrica(){
        final Double k_constante = 0.293;
        this.potenciaEletria = ((this.btusTotal * k_constante) / IDRS);
    }

    private void calcularAmperagemAC(){
        this.amperagemCircuitoAc = this.potenciaEletria / getTensao();
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

    public void setBtusTotal(Integer btusTotal) {
        this.btusTotal = btusTotal;
    }

    public void setCuva(String cuva) {
        this.cuva = cuva;
    }

    public void setPotenciaEletria(Double potenciaEletria) {
        this.potenciaEletria = potenciaEletria;
    }

    public Double getAmperagemCircuitoAc() {
        return amperagemCircuitoAc;
    }

    public void setAmperagemCircuitoAc(Double amperagemCircuitoAc) {
        this.amperagemCircuitoAc = amperagemCircuitoAc;
    }

}