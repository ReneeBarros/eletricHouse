package com.dasare.eletrichouse.EletricHouse.service;


import com.dasare.eletrichouse.EletricHouse.data.repository.IluminacaoRepository;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularIluminacaoEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularIluminacao;
import com.dasare.eletrichouse.EletricHouse.service.fabrica.FabricaEletricHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcularIluminacaoService {

    @Autowired
    private FabricaEletricHouse fab;

    @Autowired
    private IluminacaoRepository repository;


    public CalcularIluminacaoEntity iluminacaoToSave(CalcularIluminacao calIluminacao){
        return repository.save(fab.fabricarCalculoIluminacao(calIluminacao));
    }
}
