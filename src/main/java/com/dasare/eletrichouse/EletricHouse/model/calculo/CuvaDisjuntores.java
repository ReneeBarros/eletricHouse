package com.dasare.eletrichouse.EletricHouse.model.calculo;

public enum CuvaDisjuntores {
     CURVA_DISJUNTOR_TIPO_B ("CUVA_TIPO_B"),
     CURVA_DISJUNTOR_TIPO_C ("CUVA_TIPO_C");

     private final String cuva;

     CuvaDisjuntores(String cuva) {
          this.cuva = cuva;
     }

     public String getCuva() {
          return cuva;
     }
}
