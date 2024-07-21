package com.dasare.eletrichouse.EletricHouse.service;

public enum CuvaDisjuntores {
     CURVA_DISJUNTOR_TIPO_B ("CUVA_TIPO_B"),
     CURVA_DISJUNTOR_TIPO_C ("CUVA_TIPO_C");

     private String cuva;

     CuvaDisjuntores(String cuva) {
          this.cuva = cuva;
     }

     public String getCuva() {
          return cuva;
     }
}
