package com.dasare.eletrichouse.EletricHouse.controllers;


import com.dasare.eletrichouse.EletricHouse.data.request.ResquestIlumDTO;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularIluminacaoEntity;
import com.dasare.eletrichouse.EletricHouse.service.CalcularIluminacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("eletrichouse/apiv1/iluminacao")
public class IluminacaoController {

    @Autowired
    private CalcularIluminacaoService service;

    @PostMapping("/calIlumTosave")
    private ResponseEntity<CalcularIluminacaoEntity>calcularIluminacaoToSave(@RequestBody ResquestIlumDTO calIluminacao){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.iluminacaoToSave(calIluminacao));
    }

}
