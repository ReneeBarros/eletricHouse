package com.dasare.eletrichouse.EletricHouse.service.fabrica;


import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.dto.DtoCalcularToamda;


public class FabricaEletricHouse {

    public CalcularTomadaEntity fabricaCalcularTomada(CalcularTomada calcularTomada){
        calcularTomada.calcluarTomada();
        calcularTomada.calcularPerimetro();
        return new DtoCalcularToamda().calcularTomadaModelToCalcularTomadaEntity(calcularTomada);
    }


}
