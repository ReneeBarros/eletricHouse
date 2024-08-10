package com.dasare.eletrichouse.EletricHouse.controllers;

import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.CalcularTomdaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("eletrichouse/apiv1/tomada")
public class TomadaController {

    @Autowired
    private CalcularTomdaService tomService;


    @PostMapping("/caltomadaTosave")
    private ResponseEntity<CalcularTomadaEntity>calcularTomadaToSave(@RequestBody CalcularTomada tomada){
        return ResponseEntity.status(HttpStatus.CREATED).body(tomService.calcularTomadaService(tomada));
    }

}
