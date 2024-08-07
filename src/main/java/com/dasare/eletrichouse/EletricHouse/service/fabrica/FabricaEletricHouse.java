package com.dasare.eletrichouse.EletricHouse.service.fabrica;


import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.service.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.DAO.DaoCalcularToamda;


public class FabricaEletricHouse {

    public CalcularTomadaEntity fabricaCalcularTomada(CalcularTomada calcularTomada){
        calcularTomada.calcluarTomada();
        calcularTomada.perimeterCalculate();
        return new DaoCalcularToamda().calcularTomadaModelToCalcularTomadaEntity(calcularTomada);
    }


}
