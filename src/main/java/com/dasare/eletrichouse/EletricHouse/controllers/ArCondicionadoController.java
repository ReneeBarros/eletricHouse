package com.dasare.eletrichouse.EletricHouse.controllers;

import com.dasare.eletrichouse.EletricHouse.data.request.ResquestArCondDTO;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularArCondicionadoEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularArCondicionado;
import com.dasare.eletrichouse.EletricHouse.service.CalcularArCondicionadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("eletrichouse/apiv1/arcondicionado")
public class ArCondicionadoController {

    @Autowired
    private CalcularArCondicionadoService service;

    @PostMapping("/calArcondTosave")
    public ResponseEntity<CalcularArCondicionadoEntity>calcularIluminacaoToSave(@RequestBody ResquestArCondDTO calArcond){
         return ResponseEntity.status(HttpStatus.CREATED).body(service.CalarCondicToSave(calArcond));
    }
}
