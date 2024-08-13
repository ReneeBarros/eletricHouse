package com.dasare.eletrichouse.EletricHouse.service.dto;


import com.dasare.eletrichouse.EletricHouse.entity.CalcularArCondicionadoEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularArCondicionado;

public class DtoCalcularArCondicionado {

    public CalcularArCondicionadoEntity calcularArCondToCalcularArCondEntity(CalcularArCondicionado calArCond){

        return new CalcularArCondicionadoEntity(calArCond.getQuantPessoasAmbiente(), calArCond.getQuantEletrodomestico(),
                calArCond.getBtuPorM2(), calArCond.getBtuAdicionalPorPessoa(), calArCond.getBtuAdicionalPorEletronico(),
                calArCond.getBtuAdicionalInsidenciaRaioSolar(), calArCond.getBtusTotal(), calArCond.getInsidenciaRaioSolar(),
                calArCond.getCuva(),calArCond.getIDRS(), calArCond.getPotenciaEletria(), calArCond.getAmperagemCircuitoAc());

    }
}
