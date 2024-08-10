package com.dasare.eletrichouse.EletricHouse.service;

import com.dasare.eletrichouse.EletricHouse.data.repository.TomadaRepository;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.fabrica.FabricaEletricHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcularTomdaService {

    @Autowired
    private FabricaEletricHouse fab;

    @Autowired
    private TomadaRepository tomadaRepository;



    public CalcularTomadaEntity calcularTomadaService(CalcularTomada calcularTomada){
        return tomadaRepository.save(fab.fabricaCalcularTomada(calcularTomada));
    }
}
