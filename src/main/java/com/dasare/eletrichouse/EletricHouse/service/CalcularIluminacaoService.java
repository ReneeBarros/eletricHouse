package com.dasare.eletrichouse.EletricHouse.service;


import com.dasare.eletrichouse.EletricHouse.data.repository.IluminacaoRepository;
import com.dasare.eletrichouse.EletricHouse.data.request.ResquestIlumDTO;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularIluminacaoEntity;
import com.dasare.eletrichouse.EletricHouse.service.fabrica.FabricaEletricHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcularIluminacaoService {

    @Autowired
    private FabricaEletricHouse fab;

    @Autowired
    private IluminacaoRepository repository;


    public CalcularIluminacaoEntity iluminacaoToSave(ResquestIlumDTO resquest){
        return repository.save(fab.fabricarCalculoIluminacao(resquest));
    }
}
