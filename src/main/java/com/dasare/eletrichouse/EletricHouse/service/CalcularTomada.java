package com.dasare.eletrichouse.EletricHouse.service;


import org.springframework.stereotype.Service;

/*
CLASSE PARA CALCULAR TOMADA ELETRICA UTILIZANDO METODO DE AREA.

AUTO: RENEE B. BARROS
 */

@Service
public class CalcularTomada {

    private CalculosComum comunCal;
    private String ambiente;
    private Integer potenciaTomada;
    private Integer potenciaTomada3unidIncial;
    private Integer quantToamda;
    private Integer potenciaTotal;

    public CalcularTomada(CalculosComum comunCal, String ambiente) {
        this.comunCal = comunCal;
        this.ambiente = ambiente;
    }

    public CalcularTomada() {
    }

    private void calcluarTomada() {
        final Integer POTENCIA_TOMADA = 100;
        final Integer POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE = 600;
        final Double PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM = 5.0;
        final Double PARAMETRO_DIVISAO_TOMADA_AMBIENTE_ESPERCIAL = 3.5;

        switch (this.ambiente) {
            case "BANHEIRO":
                this.quantToamda = 1;
                this.potenciaTomada = POTENCIA_TOMADA;
                break;
            case "COZINHA":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_ESPERCIAL, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "COPA":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_ESPERCIAL, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
            case "SALA DE ESTUDO":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "SALA DE JANTAR":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "HALL/ESCADA/DISPENSA/GARAGEM":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_ESPERCIAL, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "SALA-USO GERAL":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "QUARTO":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "LOJAS--VITRINES":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "SALA DE ESCRITORIO":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
            case "GALPÕES":
                calculo(PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM, POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, POTENCIA_TOMADA);
                break;
        }
    }

    private void calculo(
            Double parametroDivisivel,
            Integer POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE, // 600w por tomada as 3 primeira
            Integer POTENCIA_TOMADA /// = 100w por tomada
    ) {
        Integer calculoTomada = (int) (comunCal.perimeterCalculate() / parametroDivisivel);
        this.quantToamda = calculoTomada;
        if (parametroDivisivel == 5) {
            this.potenciaTotal = calculoTomada * POTENCIA_TOMADA;
            this.potenciaTomada = POTENCIA_TOMADA;
            this.potenciaTomada3unidIncial = 0;
        } else {
            if (calculoTomada > 3) {
                var potenciaSuperior3 = (double) (POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE * 3);
                var potenciaRestante = POTENCIA_TOMADA * (calculoTomada - 3);
                this.potenciaTotal = (int) (potenciaSuperior3 + potenciaRestante);
                this.potenciaTomada3unidIncial = POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE;
            } else {
                this.potenciaTotal = calculoTomada * POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE;
                this.potenciaTomada3unidIncial = POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE;
            }
        }
    }

    public String getAmbiente() {
        return ambiente;
    }

    public Integer getPotenciaTomada() {
        return potenciaTomada;
    }

    public Integer getPotenciaTomada3unidIncial() {
        return potenciaTomada3unidIncial;
    }

    public Integer getQuantToamda() {
        return quantToamda;
    }

    public Integer getPotenciaTotal() {
        return potenciaTotal;
    }
}
