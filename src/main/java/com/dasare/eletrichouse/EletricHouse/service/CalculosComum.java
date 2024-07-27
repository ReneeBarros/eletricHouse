package com.dasare.eletrichouse.EletricHouse.service;

public class CalculosComum {

    private Double width;
    private Double length;
    private Double area;
    private Double perimeter;
    private Integer tensao;

    public CalculosComum() {
        }

    public CalculosComum(Double width, Double length, Integer tensao) {
        this.width = width;
        this.length = length;
        this.tensao = tensao;
        areaCalculate();
        this.perimeter=perimeterCalculate();
    }

    public Double areaCalculate(){
        return (this.width * this.length);
    }
    public Double perimeterCalculate(){
        return (this.width*2) + (this.length*2);
    }

    public Double calcularCorrente( double potencia){
        return  potencia / this.tensao;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Integer getTensao() {
        return tensao;
    }

    public void setTensao(Integer tensao) {
        this.tensao = tensao;
    }

}
