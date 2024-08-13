package com.dasare.eletrichouse.EletricHouse.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ArCondicionado")
public class CalcularArCondicionadoEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantPessoasAmbiente;
    private Integer quantEletrodomestico;
    private Integer btuPorM2;
    private Integer btuAdicionalPorPessoa;
    private Integer btuAdicionalPorEletronico;
    private Integer btuAdicionalInsidenciaRaioSolar;
    private Integer btusTotal;
    private Boolean insidenciaRaioSolar;
    private String  cuva;
    private Double  IDRS;
    private Double  potenciaEletria;
    private Double  amperagemCircuitoAc;

    public CalcularArCondicionadoEntity(Integer quantPessoasAmbiente, Integer quantEletrodomestico,
                                        Integer btuPorM2, Integer btuAdicionalPorPessoa, Integer btuAdicionalPorEletronico,
                                        Integer btuAdicionalInsidenciaRaioSolar, Integer btusTotal,
                                        Boolean insidenciaRaioSolar, String cuva,
                                        Double IDRS, Double potenciaEletria, Double amperagemCircuitoAc) {

        this.quantPessoasAmbiente = quantPessoasAmbiente;
        this.quantEletrodomestico = quantEletrodomestico;
        this.btuPorM2 = btuPorM2;
        this.btuAdicionalPorPessoa = btuAdicionalPorPessoa;
        this.btuAdicionalPorEletronico = btuAdicionalPorEletronico;
        this.btuAdicionalInsidenciaRaioSolar = btuAdicionalInsidenciaRaioSolar;
        this.btusTotal = btusTotal;
        this.insidenciaRaioSolar = insidenciaRaioSolar;
        this.cuva = cuva;
        this.IDRS = IDRS;
        this.potenciaEletria = potenciaEletria;
        this.amperagemCircuitoAc = amperagemCircuitoAc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setBtusTotal(Integer btusTotal) {
        this.btusTotal = btusTotal;
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

    public void setCuva(String cuva) {
        this.cuva = cuva;
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

    public void setPotenciaEletria(Double potenciaEletria) {
        this.potenciaEletria = potenciaEletria;
    }

    public Double getAmperagemCircuitoAc() {
        return amperagemCircuitoAc;
    }

    public void setAmperagemCircuitoAc(Double amperagemCircuitoAc) {
        this.amperagemCircuitoAc = amperagemCircuitoAc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalcularArCondicionadoEntity that = (CalcularArCondicionadoEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
