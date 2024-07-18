package com.dasare.eletrichouse.EletricHouse.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

/*
*  CALCULO DE QUANTIDADE DE LUMINARIA PELO METODO DE AREA.
*/

@Service
public class CalculateLight{
    private ComunCalculate comunC;
    private String ambience;
    private Integer ambienceLumens;
    private Integer luminaireLumens;
    private Integer lumensTotal;
    private Integer totalLuminaria;
    public CalculateLight() {}

    public CalculateLight(ComunCalculate comunC, String ambience, Integer ambienceLumens, Integer luminaireLumens) {
        this.comunC = comunC;
        this.ambience = ambience;
        this.ambienceLumens = ambienceLumens;
        this.luminaireLumens = luminaireLumens;
    }

    private void calculateLamp(){
        switch (this.ambience){
            case "BANHEIRO":
                this.ambienceLumens = 150;
                break;
            case "BANHEIRO--LUZ LOCAL":
                this.ambienceLumens = 300;
                break;
            case "COZINHA":
                this.ambienceLumens = 150;
                break;
            case "COZINHA--LUZ LOCAL":
                this.ambienceLumens = 500;
                break;
            case "SALA DE ESTUDO":
                this.ambienceLumens = 500;
                break;
            case "SALA DE JANTAR":
                this.ambienceLumens = 500;
                break;
            case "HALL/ESCADA/DISPENSA/GARAGEM":
                this.ambienceLumens = 150;
                break;
            case "SALA-USO GERAL":
                this.ambienceLumens = 200;
                break;
            case "QUARTO":
                this.ambienceLumens = 200;
                break;
            case "QUARTO--LUZ LOCAL":
                this.ambienceLumens = 400;
                break;
            case "LOJAS--VITRINES":
                this.ambienceLumens = 600;
                break;
            case "SALA DE ESCRITORIO":
                this.ambienceLumens = 500;
                break;
            case "GALPÕES":
                this.ambienceLumens = 500;
                break;
        }
    }
    private void calculateTotalLumens(){
        this.lumensTotal = (int) (this.ambienceLumens * comunC.areaCalculate());
        this.totalLuminaria = this.lumensTotal / luminaireLumens;
    }

    public ComunCalculate getComunC() {
        return comunC;
    }

    public void setComunC(ComunCalculate comunC) {
        this.comunC = comunC;
    }

    public String getAmbience() {
        return ambience;
    }

    public void setAmbience(String ambience) {
        this.ambience = ambience;
    }

    public Integer getAmbienceLumens() {
        return ambienceLumens;
    }

    public void setAmbienceLumens(Integer ambienceLumens) {
        this.ambienceLumens = ambienceLumens;
    }

    public Integer getLuminaireLumens() {
        return luminaireLumens;
    }

    public void setLuminaireLumens(Integer luminaireLumens) {
        this.luminaireLumens = luminaireLumens;
    }

    public Integer getLumensTotal() {
        return lumensTotal;
    }


    public Integer getTotalLuminaria() {
        return totalLuminaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculateLight that)) return false;
        return Objects.equals(getAmbience(), that.getAmbience()) && Objects.equals(getAmbienceLumens(), that.getAmbienceLumens());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmbience(), getAmbienceLumens());
    }
}