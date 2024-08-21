package com.dasare.eletrichouse.EletricHouse.data.request;

public record ResquestArCondDTO(
        Double largura,
        Double comprimento,
        String ambiente,
        String nomeAmbiente,
        Integer tensao,
        Integer quantPessoasAmbiente,
        Integer quantEletrodomestico,
        Boolean insidenciaRaioSolar
) {
}
