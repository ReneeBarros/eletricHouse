package com.dasare.eletrichouse.EletricHouse.service;

import com.dasare.eletrichouse.EletricHouse.data.repository.ArCondicionadoRepository;
import com.dasare.eletrichouse.EletricHouse.data.request.ResquestArCondDTO;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularArCondicionadoEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularArCondicionado;
import com.dasare.eletrichouse.EletricHouse.service.fabrica.FabricaEletricHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcularArCondicionadoService {

    @Autowired
    private FabricaEletricHouse fab;

    @Autowired
    private ArCondicionadoRepository repository;


    public CalcularArCondicionadoEntity CalarCondicToSave (ResquestArCondDTO calArcond){
       return repository.save(fab.fabricarCalculoArcondicionado(calArcond));
    }
}
