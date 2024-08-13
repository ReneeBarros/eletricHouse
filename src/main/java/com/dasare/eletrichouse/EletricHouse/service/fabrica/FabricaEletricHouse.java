package com.dasare.eletrichouse.EletricHouse.service.fabrica;


import com.dasare.eletrichouse.EletricHouse.entity.CalcularArCondicionadoEntity;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularIluminacaoEntity;
import com.dasare.eletrichouse.EletricHouse.entity.CalcularTomadaEntity;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularArCondicionado;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularIluminacao;
import com.dasare.eletrichouse.EletricHouse.model.calculo.CalcularTomada;
import com.dasare.eletrichouse.EletricHouse.service.dto.DtoCalcularArCondicionado;
import com.dasare.eletrichouse.EletricHouse.service.dto.DtoCalcularIluminacao;
import com.dasare.eletrichouse.EletricHouse.service.dto.DtoCalcularToamda;


public class FabricaEletricHouse {

    public CalcularTomadaEntity fabricaCalcularTomada(CalcularTomada calTomada){
        CalcularTomada tomada = new CalcularTomada(calTomada.getLargura(),
                calTomada.getComprimento(),
                calTomada.getTensao(),
                calTomada.getAmbiente());
        return new DtoCalcularToamda().calcularTomadaModelToCalcularTomadaEntity(tomada);
    }

    public CalcularIluminacaoEntity fabricarCalculoIluminacao(CalcularIluminacao calIluminacao){
        CalcularIluminacao iluminacao = new CalcularIluminacao(
                calIluminacao.getLargura(),
                calIluminacao.getComprimento(),
                calIluminacao.getTensao(),
                calIluminacao.getAmbiente(),
                calIluminacao.getLumensAmbiente(),
                calIluminacao.getLumensLuminaria(),
                calIluminacao.getPotenciaLuminaria()
        );
         return new DtoCalcularIluminacao().iluminacaoToIluminacaoEntity(iluminacao);
    }

    public CalcularArCondicionadoEntity fabricarCalculoArcondicionado(CalcularArCondicionado calArcond){
        CalcularArCondicionado arCondicionado = new CalcularArCondicionado(
                calArcond.getLargura(),
                calArcond.getComprimento(),
                calArcond.getTensao(),
                calArcond.getQuantPessoasAmbiente(),
                calArcond.getQuantEletrodomestico(),
                calArcond.getInsidenciaRaioSolar()
        );
       return new DtoCalcularArCondicionado().calcularArCondToCalcularArCondEntity(arCondicionado);
    }

}
