package com.dasare.eletrichouse.EletricHouse.service.dto;


import com.dasare.eletrichouse.EletricHouse.entity.CalcularIluminacaoEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularIluminacao;

public class DtoCalcularIluminacao {
    
    public CalcularIluminacaoEntity iluminacaoToIluminacaoEntity(CalcularIluminacao calIlum){
        return new CalcularIluminacaoEntity(calIlum.getAmbiente(), calIlum.getLumensAmbiente(), calIlum.getLumensLuminaria(),
                calIlum.getLumensTotal(), calIlum.getTotalLuminaria(), calIlum.getPotenciaLuminaria(), calIlum.getPotenciaTotal(),
                calIlum.getAmperagemCircuito()
                );
    }
}
