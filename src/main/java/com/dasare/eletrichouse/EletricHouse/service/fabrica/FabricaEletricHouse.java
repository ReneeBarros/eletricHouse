package com.dasare.eletrichouse.EletricHouse.service.fabrica;


import com.dasare.eletrichouse.EletricHouse.data.request.ResquestArCondDTO;
import com.dasare.eletrichouse.EletricHouse.data.request.ResquestIlumDTO;
import com.dasare.eletrichouse.EletricHouse.data.request.ResquestTomadaDTO;
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

    public CalcularTomadaEntity fabricaCalcularTomada(ResquestTomadaDTO calTomada){
        CalcularTomada tomada = new CalcularTomada(
                calTomada.largura(),
                calTomada.comprimento(),
                calTomada.tensao(),
                calTomada.ambiente());
        return new DtoCalcularToamda().calcularTomadaModelToCalcularTomadaEntity(calTomada.nomeAmbiente(),tomada);
    }

    public CalcularIluminacaoEntity fabricarCalculoIluminacao(ResquestIlumDTO calIluminacao){
        CalcularIluminacao iluminacao = new CalcularIluminacao(
                calIluminacao.largura(),
                calIluminacao.comprimento(),
                calIluminacao.tensao(),
                calIluminacao.ambiente(),
                calIluminacao.lumensLuminaria(),
                calIluminacao.potenciaLuminaria()
        );
         return new DtoCalcularIluminacao().iluminacaoToIluminacaoEntity(calIluminacao.nomeAmbiente(), iluminacao);
    }

    public CalcularArCondicionadoEntity fabricarCalculoArcondicionado(ResquestArCondDTO calArcond){
        CalcularArCondicionado arCondicionado = new CalcularArCondicionado(
                calArcond.largura(),
                calArcond.comprimento(),
                calArcond.tensao(),
                calArcond.quantPessoasAmbiente(),
                calArcond.quantEletrodomestico(),
                calArcond.insidenciaRaioSolar()
        );
       return new DtoCalcularArCondicionado().
               calcularArCondToCalcularArCondEntity(
                       calArcond.ambiente(),
                       calArcond.nomeAmbiente(),
                       arCondicionado
               );
    }

}
