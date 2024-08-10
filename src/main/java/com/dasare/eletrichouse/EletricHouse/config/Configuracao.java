package com.dasare.eletrichouse.EletricHouse.config;


import com.dasare.eletrichouse.EletricHouse.service.dto.DtoCalcularIluminacao;
import com.dasare.eletrichouse.EletricHouse.service.fabrica.FabricaEletricHouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dasare.eletrichouse.EletricHouse.service.dto.DtoCalcularToamda;

@Configuration
public class Configuracao {

    @Bean
    public DtoCalcularToamda daoCalcularToamda(){
        return new DtoCalcularToamda();
    }

    @Bean
    public FabricaEletricHouse fabricarEletrcHouse(){
        return new FabricaEletricHouse();
    }

    @Bean
    public DtoCalcularIluminacao dtoCalcularIluminacao(){
        return new DtoCalcularIluminacao();
    }

}
