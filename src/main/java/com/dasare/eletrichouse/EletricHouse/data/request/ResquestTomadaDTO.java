package com.dasare.eletrichouse.EletricHouse.data.request;



public record ResquestTomadaDTO(
        Double largura,
        Double comprimento,
        Integer tensao,
        String ambiente,
        String nomeAmbiente
) {
}
