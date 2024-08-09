package com.dasare.eletrichouse.EletricHouse.service;

import com.dasare.eletrichouse.EletricHouse.data.repository.TomadaRepository;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.fabrica.FabricaEletricHouse;
import org.springframework.stereotype.Service;

@Service
public class CalcularTomdaService {

    private final TomadaRepository tomadaRepository;

    public CalcularTomdaService(TomadaRepository tomadaRepository) {
        this.tomadaRepository = tomadaRepository;

    }
     FabricaEletricHouse fabricaEletricHouse = new FabricaEletricHouse();
    public CalcularTomadaEntity calcularTomadaService(CalcularTomada calcularTomada){
        CalcularTomadaEntity fab = fabricaEletricHouse.fabricaCalcularTomada(calcularTomada);
        return tomadaRepository.save(fab);
    }
}
