package com.dasare.eletrichouse.EletricHouse.model.calculo;

import java.util.List;

// O DISJUNTORES TEM A FUNÇÃO PRINCIPAL PROTEGER O CABO ELETRICO A SEGUNTARIA É PROTEGER O EQUIPAMENTO,
// ENTÃO PODEMOS TER UMA BASE DE DIMENSIONAMENTO DE DIJUSTORES CONSIDERANDO A PODENCIA SUPORTADA DO CABO ELETRICO
public class CalcularDisjuntores {
    private Double correnteCabo;
    private Double fatorDeDemanda;
    private String disjuntor;
    private Double fatorSeguranca;
    private Double correnteCircuito;
    private final List<Integer>disjuntores = List.of(10,16,20,25,32,40,50,63,70,80,100,125);

    public CalcularDisjuntores() {
    }

    public CalcularDisjuntores(Double correnteCabo, Double fatorDeDemanda,
                               Double fatorSeguranca, Double correnteCircuito) {
        this.correnteCabo = correnteCabo;
        this.fatorDeDemanda = fatorDeDemanda;
        this.fatorSeguranca = fatorSeguranca;
        this.correnteCircuito = correnteCircuito;
    }

    private void calculoDisjuntor(){
        var correnteCircuitoTotal = this.correnteCircuito * this.fatorSeguranca;
        for(Integer e : disjuntores){
            if(correnteCircuitoTotal < e && e < this.correnteCabo){
                this.disjuntor = e + "A";
            }
        }
    }

    public Double getCorrenteCabo() {
        return correnteCabo;
    }

    public void setCorrenteCabo(Double correnteCabo) {
        this.correnteCabo = correnteCabo;
    }

    public Double getFatorDeDemanda() {
        return fatorDeDemanda;
    }

    public void setFatorDeDemanda(Double fatorDeDemanda) {
        this.fatorDeDemanda = fatorDeDemanda;
    }

    public String getDisjuntor() {
        return disjuntor;
    }

    public Double getFatorSeguranca() {
        return fatorSeguranca;
    }

    public void setFatorSeguranca(Double fatorSeguranca) {
        this.fatorSeguranca = fatorSeguranca;
    }

    public Double getCorrenteCircuito() {
        return correnteCircuito;
    }

    public void setCorrenteCircuito(Double correnteCircuito) {
        this.correnteCircuito = correnteCircuito;
    }

}
