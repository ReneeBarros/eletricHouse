package com.dasare.eletrichouse.EletricHouse.model.calculo;

/*
CLASSE PARA CALCULAR TOMADA ELETRICA UTILIZANDO METODO DE AREA.

AUTO: RENEE B. BARROS
 */

import com.dasare.eletrichouse.EletricHouse.model.calculo.intefaceConstantes.PotenciaTomadaPadrao;

public class CalcularTomada extends CalculosComum implements PotenciaTomadaPadrao {


    private String ambiente;
    private Integer potenciaTomada;
    private Integer potenciaTomada3unidIncial;
    private Integer quantToamda;
    private Integer potenciaTotal;
    private Integer amperagemTomada;

    
    public CalcularTomada() {
    }

    public CalcularTomada( String ambiente ) {
        this.ambiente = ambiente;
    }


    public CalcularTomada( Double largura, Double comprimento, Integer tensao, String ambiente ) {
        super( largura, comprimento, tensao );
        this.ambiente = ambiente;
        calcularPerimetro();
        calcluarTomada();
        calcularAmperagemTomada();
    }


    public void calcluarTomada() {

        switch ( this.ambiente ) {
            case "BANHEIRO":
                this.quantToamda = 1;
                this.potenciaTomada = POTENCIA_TOMADA;
                break;
            case "COZINHA","COPA":
                calcularQantidadeTomada( PARAMETRO_DIVISAO_TOMADA_AMBIENTE_ESPERCIAL );
                calcularPotenciaTomadaAmbienteEspercial();
                break;

            case "SALA DE ESTUDO","SALA DE JANTAR",
                 "SALA-USO GERAL","QUARTO","LOJAS--VITRINES",
                 "SALA DE ESCRITORIO","GALPÕES":

                calcularQantidadeTomada( PARAMETRO_DIVISAO_TOMADA_AMBIENTE_COMUM );
                calcularPotenciaTomadaAmbienteComum();
                break;
        }
    }

    private void calcularPotenciaTomadaAmbienteEspercial(){
            if ( this.quantToamda > 3 ) {
                this.potenciaTotal = (( POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE * 3 ) + ( POTENCIA_TOMADA * ( this.quantToamda - 3 )));
                this.potenciaTomada3unidIncial = POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE;
                this.potenciaTomada = POTENCIA_TOMADA;
            } else {
                this.potenciaTotal = ( this.quantToamda * POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE );
                this.potenciaTomada3unidIncial = POTENCIA_TOMADA_SUPERIOR_A_3_UNIDADE;
            }

    }

    private void calcularPotenciaTomadaAmbienteComum(){
        this.potenciaTotal = this.quantToamda * POTENCIA_TOMADA;
        this.potenciaTomada = POTENCIA_TOMADA;
        this.potenciaTomada3unidIncial = 0;
    }

    private void calcularQantidadeTomada( Double parametroDivisao ){
        this.quantToamda = ( int ) ( calcularPerimetro() / parametroDivisao );
    }

    private void calcularAmperagemTomada(){
        this.amperagemTomada = this.potenciaTotal / getTensao();
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

    public void setPotenciaTomada( Integer potenciaTomada ) {
        this.potenciaTomada = potenciaTomada;
    }

    public void setPotenciaTomada3unidIncial( Integer potenciaTomada3unidIncial ) {
        this.potenciaTomada3unidIncial = potenciaTomada3unidIncial;
    }

    public void setQuantToamda( Integer quantToamda ) {
        this.quantToamda = quantToamda;

    }

    public void setPotenciaTotal( Integer potenciaTotal ) {
        this.potenciaTotal = potenciaTotal;

    }

    public String getAmbiente() {
        return ambiente;

    }

    public void setAmbiente( String ambiente ) {
        this.ambiente = ambiente;

    }

    public Integer getAmperagemTomada() {
        return amperagemTomada;
    }

    public void setAmperagemTomada(Integer amperagemTomada) {
        this.amperagemTomada = amperagemTomada;
    }
}
