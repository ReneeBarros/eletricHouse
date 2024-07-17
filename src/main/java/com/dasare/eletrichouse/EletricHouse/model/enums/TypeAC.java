package com.dasare.eletrichouse.EletricHouse.model.enums;

public enum TypeAC {

    AC_9000BTUS(1),
    AC_12000BTUS(2),
    AC_18000BTUS(3),
    AC_24000BTUS(4),
    AC_32000BTUS(5);
    public int type;

    TypeAC(int valor){
        type = valor;
    }

}
