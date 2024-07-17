package com.dasare.eletrichouse.EletricHouse.service;

public class ComunCalculate {

    Double width;
    Double length;
    Double area;
    Double perimeter;

    public ComunCalculate() {
    }

    public ComunCalculate(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Double areaCalculate(){
        return (this.width * this.length);
    }
    public Double perimeterCalculate(){
        return (this.width*2) + (this.length*2);
    }
}
