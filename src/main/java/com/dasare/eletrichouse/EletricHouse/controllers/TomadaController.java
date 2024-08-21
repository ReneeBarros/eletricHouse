package com.dasare.eletrichouse.EletricHouse.controllers;

import com.dasare.eletrichouse.EletricHouse.data.request.ResquestTomadaDTO;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.CalcularTomdaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("eletrichouse/apiv1/tomada")
public class TomadaController {

    @Autowired
    private CalcularTomdaService tomService;


    @PostMapping("/caltomadaTosave")
    private ResponseEntity<CalcularTomadaEntity>calcularTomadaToSave(@RequestBody ResquestTomadaDTO tomada){
        return ResponseEntity.status(HttpStatus.CREATED).body(tomService.calcularTomadaService(tomada));
    }

    @GetMapping("encontrartomada/{id}")
    private ResponseEntity<CalcularTomadaEntity>getTomadaCalculada(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(tomService.encontrarTomada(id) );
    }

}
