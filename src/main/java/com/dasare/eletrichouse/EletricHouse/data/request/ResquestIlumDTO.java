package com.dasare.eletrichouse.EletricHouse.data.request;

public record ResquestIlumDTO(
    Double largura,
    Double comprimento,
    Integer tensao,
    String ambiente,
    String nomeAmbiente,
    Integer lumensLuminaria,
    Integer totalLuminaria,
    Double potenciaLuminaria
) {
}
