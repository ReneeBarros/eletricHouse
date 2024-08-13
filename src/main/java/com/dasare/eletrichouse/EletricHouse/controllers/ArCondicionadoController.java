package com.dasare.eletrichouse.EletricHouse.controllers;

import com.dasare.eletrichouse.EletricHouse.entity.CalcularArCondicionadoEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularArCondicionado;
import com.dasare.eletrichouse.EletricHouse.service.CalcularArCondicionadoService;
import com.dasare.eletrichouse.EletricHouse.service.CalcularIluminacaoService;
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
    public ResponseEntity<CalcularArCondicionadoEntity>calcularIluminacaoToSave(@RequestBody CalcularArCondicionado calArcond){
         return ResponseEntity.status(HttpStatus.CREATED).body(service.CalarCondicToSave(calArcond));
    }
}
