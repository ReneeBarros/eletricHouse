package com.dasare.eletrichouse.EletricHouse.config;


import com.dasare.eletrichouse.EletricHouse.service.DAO.DaoCalcularToamda;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

    public DaoCalcularToamda daoCalcularToamda(DaoCalcularToamda daoCalcularToamda){
        return new DaoCalcularToamda();
    }

}
