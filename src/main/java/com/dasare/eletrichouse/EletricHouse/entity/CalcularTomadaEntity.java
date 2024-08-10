package com.dasare.eletrichouse.EletricHouse.entity;

import com.dasare.eletrichouse.EletricHouse.model.calculo.CalculosComum;

import jakarta.persistence.*;

@Entity
@Table(name = "TOMADA_CALCULADA")
public class CalcularTomadaEntity extends CalculosComum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String ambiente;
    private Integer potenciaTomada;
    private Integer potenciaTomada3unidIncial;
    private Integer quantTomada;
    private Integer potenciaTotal;

    public CalcularTomadaEntity() {
    }

    public CalcularTomadaEntity(String ambiente, Integer potenciaTomada,
                                Integer potenciaTomada3unidIncial,
                                Integer quantTomada, Integer potenciaTotal) {

        this.ambiente = ambiente;
        this.potenciaTomada = potenciaTomada;
        this.potenciaTomada3unidIncial = potenciaTomada3unidIncial;
        this.quantTomada = quantTomada;
        this.potenciaTotal = potenciaTotal;
    }


    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Integer getPotenciaTomada() {
        return potenciaTomada;
    }

    public void setPotenciaTomada(Integer potenciaTomada) {
        this.potenciaTomada = potenciaTomada;
    }

    public Integer getPotenciaTomada3unidIncial() {
        return potenciaTomada3unidIncial;
    }

    public void setPotenciaTomada3unidIncial(Integer potenciaTomada3unidIncial) {
        this.potenciaTomada3unidIncial = potenciaTomada3unidIncial;
    }

    public Integer getQuantToamda() {
        return quantTomada;
    }

    public void setQuantToamda(Integer quantToamda) {
        this.quantTomada = quantToamda;
    }

    public Integer getPotenciaTotal() {
        return potenciaTotal;
    }

    public void setPotenciaTotal(Integer potenciaTotal) {
        this.potenciaTotal = potenciaTotal;
    }

}
