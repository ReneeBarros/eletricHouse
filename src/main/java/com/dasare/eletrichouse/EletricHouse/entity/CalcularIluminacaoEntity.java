package com.dasare.eletrichouse.EletricHouse.entity;


import jakarta.persistence.*;

@Table(name="iluminacao_calculado")
@Entity
public class CalcularIluminacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ambiente;
    private Integer lumensAmbiente;
    private Integer lumensLuminaria;
    private Integer lumensTotal;
    private Integer totalLuminaria;
    private Double potenciaLuminaria;
    private Double potenciaTotal;
    private Double amperagemCircuito;

    public CalcularIluminacaoEntity() {
    }

    public CalcularIluminacaoEntity(String ambiente, Integer lumensAmbiente, Integer lumensLuminaria,
                                    Integer lumensTotal, Integer totalLuminaria, Double potenciaLuminaria,
                                    Double potenciaTotal, Double amperagemCircuito) {
        this.ambiente = ambiente;
        this.lumensAmbiente = lumensAmbiente;
        this.lumensLuminaria = lumensLuminaria;
        this.lumensTotal = lumensTotal;
        this.totalLuminaria = totalLuminaria;
        this.potenciaLuminaria = potenciaLuminaria;
        this.potenciaTotal = potenciaTotal;
        this.amperagemCircuito = amperagemCircuito;
    }

    public Long getId() {
        return id;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Integer getLumensAmbiente() {
        return lumensAmbiente;
    }

    public void setLumensAmbiente(Integer lumensAmbiente) {
        this.lumensAmbiente = lumensAmbiente;
    }

    public Integer getLumensLuminaria() {
        return lumensLuminaria;
    }

    public void setLumensLuminaria(Integer lumensLuminaria) {
        this.lumensLuminaria = lumensLuminaria;
    }

    public Integer getLumensTotal() {
        return lumensTotal;
    }

    public void setLumensTotal(Integer lumensTotal) {
        this.lumensTotal = lumensTotal;
    }

    public Integer getTotalLuminaria() {
        return totalLuminaria;
    }

    public void setTotalLuminaria(Integer totalLuminaria) {
        this.totalLuminaria = totalLuminaria;
    }

    public Double getPotenciaLuminaria() {
        return potenciaLuminaria;
    }

    public void setPotenciaLuminaria(Double potenciaLuminaria) {
        this.potenciaLuminaria = potenciaLuminaria;
    }

    public Double getPotenciaTotal() {
        return potenciaTotal;
    }

    public void setPotenciaTotal(Double potenciaTotal) {
        this.potenciaTotal = potenciaTotal;
    }

    public Double getAmperagemCircuito() {
        return amperagemCircuito;
    }

    public void setAmperagemCircuito(Double amperagemCircuito) {
        this.amperagemCircuito = amperagemCircuito;
    }
}
