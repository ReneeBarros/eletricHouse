package com.dasare.eletrichouse.EletricHouse.service;


import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CalcularCaboEletrico {
    Integer tensaoCircuito;
    Double pontenciaCircuito;
    Double amperagemCircuito;
    Integer metodoInstalacao;
    Integer quantidadeCondutorCarregado;
    Double caboEletrico;
    Double amperagemCaboEletrico;
    private Integer fatorAgrupamento;
    String status;

    public CalcularCaboEletrico() {
    }

    public CalcularCaboEletrico(Integer tensaoCircuito, Double pontenciaCircuito, Double amperagemCircuito, Integer metodoInstalacao, Integer quantidadeCondutorCarregado) {
        this.tensaoCircuito = tensaoCircuito;
        this.pontenciaCircuito = pontenciaCircuito;
        this.amperagemCircuito = amperagemCircuito;
        this.metodoInstalacao = metodoInstalacao;
        this.quantidadeCondutorCarregado = quantidadeCondutorCarregado;
    }

    private void calcularCabo() {
        // metodos de referencia indicado na tabela da norma 5410 para escolher o modelo de instalação dos cabos
        // Amperagem de cabos eletricos baseado nosso

        List<String> metodoReferncia = List.of("A1-2", "A1-3", "A2-2", "A2-3", "B1-2", "B1-3", "B2-2", "B2-3");
        List<Double> secoesNorminais = List.of(0.5, 0.75, 1.0, 1.5, 2.5, 4.0, 6.0, 10.0, 16.0, 25.0, 35.0, 50.0, 70.0);
        Map<Integer,Double> fatoragrupamento = Map.of(
                1,1.0,2,0.80,3,0.70,4,0.65,
                5,0.60,6,0.57,7,0.54,8,0.52,11,0.50,15,0.45);

        fatorDeAgrupamento(fatoragrupamento,fatorAgrupamento);
        String chave = buscadorDeChaveReferencia(metodoReferncia);
        var amperagemCabo = getStringListMap(chave);
        this.status = encontrarCabo(amperagemCabo, secoesNorminais);
    }

    private List<Double> getStringListMap(String chaveDeBusca) {
        // TODO: Criar um tabela no banco de dados para trazer essas informações.
        List<Double> amp1 = List.of(7.0, 9.0, 11.0, 14.5, 19.5, 26.0, 34.0, 46.0, 61.0, 80.0, 99.0, 119.0, 151.0);
        List<Double> amp2 = List.of(7.0, 9.0, 11.0, 14.0, 18.5, 25.0, 32.0, 43.0, 57.0, 75.0, 92.0, 110.0, 139.0);
        List<Double> amp3 = List.of(7.0, 9.0, 10.0, 13.5, 18.0, 24.0, 31.0, 42.0, 56.0, 73.0, 89.0, 108.0, 136.0);
        List<Double> amp4 = List.of(7.0, 9.0, 10.0, 13.0, 17.5, 23.0, 29.0, 39.0, 52.0, 68.0, 83.0, 99.0, 125.0);
        List<Double> amp5 = List.of(9.0, 11.0, 14.0, 17.5, 24.0, 32.0, 41.0, 57.0, 76.0, 101.0, 125.0, 151.0, 192.0);
        List<Double> amp6 = List.of(8.0, 10.0, 12.0, 15.5, 21.0, 28.0, 36.0, 50.0, 68.0, 89.0, 110.0, 134.0, 171.0);
        List<Double> amp7 = List.of(9.0, 11.0, 13.0, 16.5, 23.0, 30.0, 38.0, 52.0, 69.0, 90.0, 111.0, 133.0, 168.0);
        List<Double> amp8 = List.of(8.0, 10.0, 12.0, 15.0, 20.0, 27.0, 34.0, 46.0, 62.0, 80.0, 99.0, 118.0, 149.0);
        Map<String, List<Double>> amperagemCabo = Map.of(
                "A1-2", amp1, "A1-3", amp2,
                "A2-2", amp3, "A2-3", amp4,
                "B1-2", amp5, "B1-3", amp6,
                "B2-2", amp7, "B2-3", amp8
        );
        return amperagemCabo.get(chaveDeBusca);
    }

    /*
    <item>Escolher Metodo de Instalacao</item>
    <item>1-Condutores isolados ou cabos. unipolares em eletroduto de seção circular embutido em parede termicamente isolante--> A1</item>
    <item>2-Cabo multipolar em eletroduto de seção circular embutido em parede termicamente isolante--> A2</item>
    <item>3-Condutores isolados ou cabos unipolares em eletroduto aparente de seção circular--> B1</item>
    <item>4-Cabo multipolar em eletroduto aparente de seção circular--> B2</item>
    <item>5-Condutores isolados ou cabos. unipolares em eletroduto de seção não circular embutido em parede termicamente isolante--> B1</item>
    <item>6-Cabo multipolar em eletroduto aparente de seção não circular--> B2</item>
    <item>7-Condutores isolados ou cabos. unipolares em eletroduto de seção não circular embutido em alvenaria--> B1</item>
    <item>8-Cabo multipolar em eletroduto aparente de seção circular embutido em alvenaria--> B2</item>
    <item>35-Condutores isolados ou cabos. unipolares em canaleta ou perfilado suspensa--> B1</item>
    <item>36-Cabo multipolar em canaleta suspensa--> B2</item>

     */
    private String buscadorDeChaveReferencia(List<String> metodoReferncia) {
        String chaveReferenciaDeBusca = "";
        return switch (metodoInstalacao) {
            case 1 -> {
                chaveReferenciaDeBusca = condutorCarregado(metodoReferncia, 0, 1);
                yield chaveReferenciaDeBusca;
            }
            case 2 -> {
                chaveReferenciaDeBusca = condutorCarregado(metodoReferncia, 2, 3);
                yield chaveReferenciaDeBusca;
            }
            case 3, 5, 6, 7 -> {
                chaveReferenciaDeBusca = condutorCarregado(metodoReferncia, 4, 5);
                yield chaveReferenciaDeBusca;
            }
            case 4, 8 -> {
                chaveReferenciaDeBusca = condutorCarregado(metodoReferncia, 6, 7);
                yield chaveReferenciaDeBusca;
/*            case 5, 6, 7: {
                chaveReferenciaDeBusca =condutorCarregado(metodoReferncia,4,5);
                // essa utilizar o metodo B1-2 ou B1-3
                return chaveReferenciaDeBusca;

            }*/
/*            case 8: {
                chaveReferenciaDeBusca = condutorCarregado(metodoReferncia,6,7);
                return chaveReferenciaDeBusca;
                // essa utilizar o metodo B1-2 ou B1-3
            }*/
            }
            default -> chaveReferenciaDeBusca;
        };
    }

    private String condutorCarregado(List<String> metodoDeReferencia, int location1, int location2) {
        return (this.quantidadeCondutorCarregado == 2) ? metodoDeReferencia.get(location1) : metodoDeReferencia.get(location2);
    }

    private String encontrarCabo(List<Double> amperagemNorma, List<Double> secoesNorminais) {
        String retorno = "Sucesso";


        for (Double e : amperagemNorma) {
            if (this.amperagemCircuito < e) {
                this.caboEletrico = secoesNorminais.get(amperagemNorma.indexOf(e));
                this.amperagemCaboEletrico = e;
                break;
            } else if (Objects.equals(this.amperagemCircuito, e)) {
                this.caboEletrico = secoesNorminais.get(amperagemNorma.indexOf(e));
                this.amperagemCaboEletrico = e;

                break;
            }
/*                else if (this.amperagemCircuito > e) {
                    this.caboEletrico = secoesNorminais.get(lista1.indexOf(e));
                    break;
                }*/
            if (this.amperagemCircuito > amperagemNorma.get(amperagemNorma.size() - 1)) {
                retorno = "Lamentamos, mas não temos uma bitola em nosso sistema para atender essa amperagem ";
                this.amperagemCaboEletrico = 0.0;
            }
        }
        return retorno;
    }

    private void fatorDeAgrupamento(Map<Integer,Double>agrupamento, Integer fatorAgrupamento){
        this.amperagemCircuito = agrupamento.get(fatorAgrupamento) * this.amperagemCircuito;
    }

    public Integer getTensaoCircuito() {
        return tensaoCircuito;
    }

    public Double getPontenciaCircuito() {
        return pontenciaCircuito;
    }

    public Double getAmperagemCircuito() {
        return amperagemCircuito;
    }

    public Integer getMetodoInstalacao() {
        return metodoInstalacao;
    }

    public Integer getQuantidadeCondutorCarregado() {
        return quantidadeCondutorCarregado;
    }

    public Double getCaboEletrico() {
        return caboEletrico;
    }

    public Double getAmperagemCaboEletrico() {
        return amperagemCaboEletrico;
    }

    public String getStatus() {
        return status;
    }
}
