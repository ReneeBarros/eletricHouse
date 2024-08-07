package com.dasare.eletrichouse.EletricHouse.service.DAO;


import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.service.CalcularTomada;


public class DaoCalcularToamda {
    public CalcularTomadaEntity calcularTomadaEntityToCalcularTomadaModel(CalcularTomadaEntity calcularTomadaEntity){
        CalcularTomada calcularTomada = new CalcularTomada(calcularTomadaEntity.getAmbiente());
        return new CalcularTomadaEntity(calcularTomada.getAmbiente(),
                calcularTomada.getPotenciaTomada(),
                calcularTomadaEntity.getPotenciaTomada3unidIncial(),
                calcularTomada.getQuantToamda(),calcularTomada.getPotenciaTotal());
    }

    public CalcularTomadaEntity calcularTomadaModelToCalcularTomadaEntity(CalcularTomada calcularTomada){

        return new CalcularTomadaEntity(calcularTomada.getAmbiente(),
                calcularTomada.getPotenciaTomada(),calcularTomada.getPotenciaTomada3unidIncial(),
                calcularTomada.getQuantToamda(),calcularTomada.getPotenciaTotal());
    }
}
