package com.dasare.eletrichouse.EletricHouse.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "AMBIENTE_DIMENCIONADO")
@Entity
public class EletricHouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ambiente;
    Double largura;
    Double comprimento;
    Double area;
    Double perimetro;
    Integer tensao;
    Double corrente;
    Double fatorDemanda;
    Double fatorSeguranca;
    Double fatoragrupamento;
    String metodoreferencia;
    Integer lumensAmbiente;
    Integer lumensLuminaria;
    Integer quantLuminaria;
    Double potenciaLuminarias;
    Double caboEletricoLuminaria;
    Integer quantTomada;
    Double potenciaTomadas;
    Double caboEletricoTomada;
    Integer btusBaseCalculo;
    Double totalBtusCalculado;
    String arCondicionadoDimencionado;
    Double potenciaArCondicionado;
    Double caboEletricoArCondicionado;
    Integer disjuntorArCondicionado;
    Double idrsArCondicionado;
    char CuvaDisjuntor;

    public EletricHouseEntity() {
    }

    public EletricHouseEntity(String ambiente, Double largura, Double comprimento, Double area, Double perimetro,
                              Integer tensao, Double corrente, Double fatorDemanda,
                              Double fatorSeguranca, Double fatoragrupamento, String metodoreferencia,
                              Integer lumensAmbiente, Integer lumensLuminaria,
                              Integer quantLuminaria, Double potenciaLuminarias, Double caboEletricoLuminaria,
                              Integer quantTomada, Double potenciaTomadas, Double caboEletricoTomada, Integer btusBaseCalculo, Double totalBtusCalculado,
                              String arCondicionadoDimencionado, Double potenciaArCondicionado, Double caboEletricoArCondicionado,
                              Integer disjuntorArCondicionado, Double idrsArCondicionado, char cuvaDisjuntor) {
        this.ambiente = ambiente;
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = area;
        this.perimetro = perimetro;
        this.tensao = tensao;
        this.corrente = corrente;
        this.fatorDemanda = fatorDemanda;
        this.fatorSeguranca = fatorSeguranca;
        this.fatoragrupamento = fatoragrupamento;
        this.metodoreferencia = metodoreferencia;
        this.lumensAmbiente = lumensAmbiente;
        this.lumensLuminaria = lumensLuminaria;
        this.quantLuminaria = quantLuminaria;
        this.potenciaLuminarias = potenciaLuminarias;
        this.caboEletricoLuminaria = caboEletricoLuminaria;
        this.quantTomada = quantTomada;
        this.potenciaTomadas = potenciaTomadas;
        this.caboEletricoTomada = caboEletricoTomada;
        this.btusBaseCalculo = btusBaseCalculo;
        this.totalBtusCalculado = totalBtusCalculado;
        this.arCondicionadoDimencionado = arCondicionadoDimencionado;
        this.potenciaArCondicionado = potenciaArCondicionado;
        this.caboEletricoArCondicionado = caboEletricoArCondicionado;
        this.disjuntorArCondicionado = disjuntorArCondicionado;
        this.idrsArCondicionado = idrsArCondicionado;
        CuvaDisjuntor = cuvaDisjuntor;
    }

    public EletricHouseEntity(String ambiente, Double largura, Double comprimento, Double area, Integer tensao, Double corrente,
                              Double fatorDemanda, Double fatorSeguranca, Double fatoragrupamento, String metodoreferencia,
                              Integer lumensAmbiente, Integer lumensLuminaria,
                              Integer quantLuminaria, Double potenciaLuminarias,
                              Double caboEletricoLuminaria, Integer quantTomada) {
        this.ambiente = ambiente;
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = area;
        this.tensao = tensao;
        this.corrente = corrente;
        this.fatorDemanda = fatorDemanda;
        this.fatorSeguranca = fatorSeguranca;
        this.fatoragrupamento = fatoragrupamento;
        this.metodoreferencia = metodoreferencia;
        this.lumensAmbiente = lumensAmbiente;
        this.lumensLuminaria = lumensLuminaria;
        this.quantLuminaria = quantLuminaria;
        this.potenciaLuminarias = potenciaLuminarias;
        this.caboEletricoLuminaria = caboEletricoLuminaria;
        this.quantTomada = quantTomada;
    }

    public EletricHouseEntity(String ambiente, Double largura, Double comprimento, Double area, Double perimetro, Integer tensao,
                              Double corrente, Double fatorDemanda, Double fatorSeguranca, Double fatoragrupamento,
                              String metodoreferencia, Integer quantTomada, Double potenciaTomadas, Double caboEletricoTomada) {
        this.ambiente = ambiente;
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = area;
        this.perimetro = perimetro;
        this.tensao = tensao;
        this.corrente = corrente;
        this.fatorDemanda = fatorDemanda;
        this.fatorSeguranca = fatorSeguranca;
        this.fatoragrupamento = fatoragrupamento;
        this.metodoreferencia = metodoreferencia;
        this.quantTomada = quantTomada;
        this.potenciaTomadas = potenciaTomadas;
        this.caboEletricoTomada = caboEletricoTomada;
    }

    public EletricHouseEntity(String ambiente, Double largura, Double comprimento, Double area, Double perimetro,
                              Integer tensao, Double corrente, Double fatorDemanda, Double fatorSeguranca, Double fatoragrupamento,
                              String metodoreferencia, Integer btusBaseCalculo, Double totalBtusCalculado, String arCondicionadoDimencionado,
                              Double potenciaArCondicionado, Double caboEletricoArCondicionado,
                              Integer disjuntorArCondicionado, Double idrsArCondicionado, char cuvaDisjuntor) {
        this.ambiente = ambiente;
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = area;
        this.perimetro = perimetro;
        this.tensao = tensao;
        this.corrente = corrente;
        this.fatorDemanda = fatorDemanda;
        this.fatorSeguranca = fatorSeguranca;
        this.fatoragrupamento = fatoragrupamento;
        this.metodoreferencia = metodoreferencia;
        this.btusBaseCalculo = btusBaseCalculo;
        this.totalBtusCalculado = totalBtusCalculado;
        this.arCondicionadoDimencionado = arCondicionadoDimencionado;
        this.potenciaArCondicionado = potenciaArCondicionado;
        this.caboEletricoArCondicionado = caboEletricoArCondicionado;
        this.disjuntorArCondicionado = disjuntorArCondicionado;
        this.idrsArCondicionado = idrsArCondicionado;
        CuvaDisjuntor = cuvaDisjuntor;
    }

    public Long getId() {
        return id;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public Double getLargura() {
        return largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public Double getArea() {
        return area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public Integer getTensao() {
        return tensao;
    }

    public Double getCorrente() {
        return corrente;
    }

    public Double getFatorDemanda() {
        return fatorDemanda;
    }

    public Double getFatorSeguranca() {
        return fatorSeguranca;
    }

    public Double getFatoragrupamento() {
        return fatoragrupamento;
    }

    public String getMetodoreferencia() {
        return metodoreferencia;
    }

    public Integer getLumensAmbiente() {
        return lumensAmbiente;
    }

    public Integer getLumensLuminaria() {
        return lumensLuminaria;
    }

    public Integer getQuantLuminaria() {
        return quantLuminaria;
    }

    public Double getPotenciaLuminarias() {
        return potenciaLuminarias;
    }

    public Double getCaboEletricoLuminaria() {
        return caboEletricoLuminaria;
    }

    public Integer getQuantTomada() {
        return quantTomada;
    }

    public Double getPotenciaTomadas() {
        return potenciaTomadas;
    }

    public Double getCaboEletricoTomada() {
        return caboEletricoTomada;
    }

    public Integer getBtusBaseCalculo() {
        return btusBaseCalculo;
    }

    public Double getTotalBtusCalculado() {
        return totalBtusCalculado;
    }

    public String getArCondicionadoDimencionado() {
        return arCondicionadoDimencionado;
    }

    public Double getPotenciaArCondicionado() {
        return potenciaArCondicionado;
    }

    public Double getCaboEletricoArCondicionado() {
        return caboEletricoArCondicionado;
    }

    public Integer getDisjuntorArCondicionado() {
        return disjuntorArCondicionado;
    }

    public Double getIdrsArCondicionado() {
        return idrsArCondicionado;
    }

    public char getCuvaDisjuntor() {
        return CuvaDisjuntor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EletricHouseEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getAmbiente(), that.getAmbiente()) && Objects.equals(getLargura(), that.getLargura()) && Objects.equals(getComprimento(), that.getComprimento()) && Objects.equals(getArea(), that.getArea()) && Objects.equals(getPerimetro(), that.getPerimetro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAmbiente(), getLargura(), getComprimento(), getArea(), getPerimetro());
    }

    @Override
    public String toString() {
        return "EletricHouseModel{" +
                "id=" + id +
                ", ambiente='" + ambiente + '\'' +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", area=" + area +
                ", perimetro=" + perimetro +
                ", tensao=" + tensao +
                ", corrente=" + corrente +
                ", fatorDemanda=" + fatorDemanda +
                ", fatorSeguranca=" + fatorSeguranca +
                ", fatoragrupamento=" + fatoragrupamento +
                ", metodoreferencia='" + metodoreferencia + '\'' +
                ", lumensAmbiente=" + lumensAmbiente +
                ", lumensLuminaria=" + lumensLuminaria +
                ", quantLuminaria=" + quantLuminaria +
                ", potenciaLuminarias=" + potenciaLuminarias +
                ", caboEletricoLuminaria=" + caboEletricoLuminaria +
                ", quantTomada=" + quantTomada +
                ", potenciaTomadas=" + potenciaTomadas +
                ", caboEletricoTomada=" + caboEletricoTomada +
                ", btusBaseCalculo=" + btusBaseCalculo +
                ", totalBtusCalculado=" + totalBtusCalculado +
                ", arCondicionadoDimencionado='" + arCondicionadoDimencionado + '\'' +
                ", potenciaArCondicionado=" + potenciaArCondicionado +
                ", caboEletricoArCondicionado=" + caboEletricoArCondicionado +
                ", disjuntorArCondicionado=" + disjuntorArCondicionado +
                ", idrsArCondicionado=" + idrsArCondicionado +
                ", CuvaDisjuntor=" + CuvaDisjuntor +
                '}';
    }
}
