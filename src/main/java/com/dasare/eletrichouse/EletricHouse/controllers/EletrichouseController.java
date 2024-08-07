package com.dasare.eletrichouse.EletricHouse.controllers;

import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.service.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.CalcularTomdaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EletrichouseController {

    private final CalcularTomdaService tomService;
    public EletrichouseController( CalcularTomdaService tomService) {
        this.tomService = tomService;
    }
    @PostMapping("/caltomada")
    private ResponseEntity<CalcularTomadaEntity>calcularTomada(@RequestBody CalcularTomada tomada){
        return ResponseEntity.status(HttpStatus.CREATED).body(tomService.calcularTomadaService(tomada));
    }
}
