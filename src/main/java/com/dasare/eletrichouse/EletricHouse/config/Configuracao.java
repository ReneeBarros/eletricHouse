package com.dasare.eletrichouse.EletricHouse.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dasare.eletrichouse.EletricHouse.service.dto.DtoCalcularToamda;

@Configuration
public class Configuracao {

    public DtoCalcularToamda daoCalcularToamda(){
        return new DtoCalcularToamda();
    }

}
