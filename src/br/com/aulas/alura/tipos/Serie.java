package br.com.aulas.alura.tipos;

import br.com.aulas.alura.informacoes.Titulos;

public class Serie extends Titulos {

private double numeroDeTemporadas;
private double episodios;
private double tempoDeCadaEpisodio;

    @Override
    public void exibeFichaTecnica() {

        System.out.println("Seu nome é: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Soma das avaliações: " + getSomaDasAvaliacoes());
        System.out.println("Número de temporadas: " + getNumeroDeTemporadas());
        System.out.println("Episódios por temporada: " + getEpisodios());
        System.out.println("Tempo de cada episódio: " + getTempoDeCadaEpisodio() + "min");

    }
    @Override
    public double getDuracaoEmMinutos(){

        return tempoDeCadaEpisodio * episodios * numeroDeTemporadas;
    }

    public double getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(double numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public double getEpisodios() {
        return episodios;
    }

    public void setEpisodios(double episodios) {
        this.episodios = episodios;
    }

    public double getTempoDeCadaEpisodio() {
        return tempoDeCadaEpisodio;
    }

    public void setTempoDeCadaEpisodio(double tempoDeCadaEpisodio) {
        this.tempoDeCadaEpisodio = tempoDeCadaEpisodio;
    }
}
