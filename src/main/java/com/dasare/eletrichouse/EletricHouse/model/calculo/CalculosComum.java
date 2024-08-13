package com.dasare.eletrichouse.EletricHouse.model.calculo;

public class CalculosComum {
    

    private Double largura;
    private Double comprimento;
    private Integer tensao;
    private Double area;

    public CalculosComum() {
    }

    public CalculosComum(Double area) {
        this.area = area;
    }

    public CalculosComum(Double largura, Double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public CalculosComum(Double largura, Double comprimento, Integer tensao) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.tensao = tensao;
        calcularArea();
        calcularPerimetro();
    }

    public Double calcularArea(){
        return this.largura * this.comprimento;
    }

    public Double calcularPerimetro(){
        return (this.largura*2) + (this.comprimento*2);
    }





    public Integer getTensao() {
        return tensao;
    }

    public void setTensao(Integer tensao) {
        this.tensao = tensao;
    }



    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setcomprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() { return largura; }

    public void setLargura(Double largura) {
        this.largura = largura;
    }
}
