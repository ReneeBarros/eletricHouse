package com.dasare.eletrichouse.EletricHouse.model;

public record EletricHouse(
        String ambiente,
        Double largura,
        Double comprimento,
        Double area,
        Double perimetro,
        Integer tensao,
        Double corrente,
        Double fatorDemanda,
        Double fatorSeguranca,
        Double fatoragrupamento,
        String metodoreferencia,
        Integer lumensAmbiente,
        Integer lumensLuminaria,
        Integer quantLuminaria,
        Double potenciaLuminarias,
        Double caboEletricoLuminaria,
        Integer quantTomada,
        Double potenciaTomadas,
        Double caboEletricoTomada,
        Integer btusBaseCalculo,
        Double totalBtusCalculado,
        String arCondicionadoDimencionado,
        Double potenciaArCondicionado,
        Double caboEletricoArCondicionado,
        Integer disjuntorArCondicionado,
        Double idrsArCondicionado,
        char CuvaDisjuntor

){}



