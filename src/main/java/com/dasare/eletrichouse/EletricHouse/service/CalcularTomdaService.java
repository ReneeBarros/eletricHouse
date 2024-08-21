package com.dasare.eletrichouse.EletricHouse.service;

import com.dasare.eletrichouse.EletricHouse.data.repository.TomadaRepository;
import com.dasare.eletrichouse.EletricHouse.data.request.ResquestTomadaDTO;
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


    public CalcularTomadaEntity calcularTomadaService(ResquestTomadaDTO calcularTomada){

        return tomadaRepository.save(fab.fabricaCalcularTomada(calcularTomada));
    }

    public CalcularTomadaEntity encontrarTomada(Long id){
       return tomadaRepository.findById(id).get();
    }
}
