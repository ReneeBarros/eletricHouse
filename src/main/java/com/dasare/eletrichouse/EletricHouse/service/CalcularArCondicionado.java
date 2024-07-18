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

    private ComunCalculate comunCal;
    private Integer quantPessoasAmbiente;
    private Integer quantEletrodomestico;
    private Integer btuPorM2;
    private Integer btuAdicionalPorPessoa;
    private Integer btuAdicionalPorEletronico;
    private Integer btuAdicionalInsidenciaRaioSolar;
    private Integer btusTotal;
    private Boolean insidenciaRaioSolar;

    public CalcularArCondicionado(
            ComunCalculate comunCal, Integer quantPessoasAmbiente,
            Integer quantEletrodomestico, Boolean insidenciaRaioSolar) {

        this.comunCal = comunCal;
        this.quantPessoasAmbiente = quantPessoasAmbiente;
        this.quantEletrodomestico = quantEletrodomestico;
        this.btuPorM2 = BTUS_POR_METRO_QUADRADO;
        this.btuAdicionalPorPessoa = BTUS_ADICIONAL_POR_PESSOA;
        this.btuAdicionalPorEletronico = BTUS_ADICIONAL_POR_ELETRONICO;
        this.btuAdicionalInsidenciaRaioSolar = BTUS_ADICIONAL_POR_INCIDENCIA_SOLAR;
        this.insidenciaRaioSolar = insidenciaRaioSolar;
    }
    private void calcularBtus() {
        Integer _btusTotal = (int) (comunCal.areaCalculate() * btuPorM2);
        Integer _totalBtusPessoasAmbiente = 0;
        Integer _totalBtusEletronicosBtus = 0;
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

}