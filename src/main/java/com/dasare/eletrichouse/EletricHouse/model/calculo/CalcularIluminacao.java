package com.dasare.eletrichouse.EletricHouse.model.calculo;


/*
*  CALCULO DE QUANTIDADE DE LUMINARIA PELO METODO DE AREA.
*/

public class CalcularIluminacao extends CalculosComum {

    private String ambiente;
    private Integer lumensAmbiente;
    private Integer lumensLuminaria;
    private Integer lumensTotal;
    private Integer totalLuminaria;
    private Double potenciaLuminaria;
    private Double potenciaTotal;
    private Double amperagemCircuito;

    public CalcularIluminacao() {}

    public CalcularIluminacao(Double largura,
                              Double comprimento,
                              Integer tensao,
                              String ambiente,
                              Integer lumensLuminaria,
                              Double potenciaLuminaria
    ) {
        super(largura,comprimento,tensao);
        this.ambiente = ambiente;
        this.lumensLuminaria = lumensLuminaria;
        this.potenciaLuminaria = potenciaLuminaria;

        definirLumensAmbiente();
        calcularLumensTotal();
        calcularPotenciaTotal();
        calcularAmperagem();
    }

    public CalcularIluminacao(Double area,
                              String ambiente,
                              Double potenciaLuminaria,
                              Integer lumensLuminaria
    ) {
        super(area);
        this.ambiente = ambiente;
        this.potenciaLuminaria = potenciaLuminaria;
        this.lumensLuminaria = lumensLuminaria;
        calcularArea();
        definirLumensAmbiente();
        calcularLumensTotal();
        calcularPotenciaTotal();
        calcularAmperagem();

    }

    private void definirLumensAmbiente(){
        switch (this.ambiente){
            case "BANHEIRO", "HALL/ESCADA/DISPENSA/GARAGEM", "COZINHA":
                this.lumensAmbiente = 150;
                break;
            case "BANHEIRO--LUZ LOCAL":
                this.lumensAmbiente = 300;
                break;
            case "COZINHA--LUZ LOCAL", "SALA DE ESCRITORIO", "SALA DE JANTAR", "SALA DE ESTUDO", "GALPÕES":
                this.lumensAmbiente = 500;
                break;
            case "SALA-USO GERAL", "QUARTO":
                this.lumensAmbiente = 200;
                break;
            case "QUARTO--LUZ LOCAL":
                this.lumensAmbiente = 400;
                break;
            case "LOJAS--VITRINES":
                this.lumensAmbiente = 600;
                break;
        }
    }
    private void calcularLumensTotal(){
        this.lumensTotal = (int) (this.lumensAmbiente * calcularArea());
        this.totalLuminaria = this.lumensTotal / lumensLuminaria;
    }

    private void calcularPotenciaTotal(){

        this.potenciaTotal = this.potenciaLuminaria * this.totalLuminaria;
    }

    public void calcularAmperagem(){
        this.amperagemCircuito = this.potenciaTotal / getTensao();
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