package br.com.aulas.alura;

import br.com.aulas.alura.informacoes.CalculardoraDeTempo;
import br.com.aulas.alura.tipos.Filme;
import br.com.aulas.alura.tipos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie serie1 = new Serie();

        filme1.setDuracaoEmMinutos(100);
        filme1.setNome("Aprendendo Programação");
        filme1.setAnoDeLancamento(2023);
        filme1.avalia(10);
        filme1.avalia(5);
        filme1.avalia(4);
        filme1.avalia(4);
        filme1.avalia(1);


        filme2.setDuracaoEmMinutos(200);
        filme2.setNome("Estudando Programação");
        filme2.setAnoDeLancamento(2023);
        filme2.avalia(8.8);
        filme2.avalia(10);
        filme2.avalia(5);

        serie1.setNome("Suits");
        serie1.setAnoDeLancamento(2018);
        serie1.avalia(6);
        serie1.avalia(10);
        serie1.avalia(7);
        serie1.setEpisodios(10);
        serie1.setNumeroDeTemporadas(5);
        serie1.setTempoDeCadaEpisodio(40);

        //Filme1

        filme1.exibeFichaTecnica();
        filme1.pegaMedia();

        //Filme2

        filme2.exibeFichaTecnica();
        filme2.pegaMedia();

        //Série1

        serie1.exibeFichaTecnica();
        serie1.pegaMedia();
        System.out.println("Para maratonar vai demorar: " + serie1.getDuracaoEmMinutos() + "min");

        CalculardoraDeTempo calculardoraDeTempo = new CalculardoraDeTempo();

        calculardoraDeTempo.assistir(serie1);


        System.out.println("Total de minutos assistidos: " + calculardoraDeTempo.getTempoTotalAssistido());

        calculardoraDeTempo.assistir(filme2);


        System.out.println("Total de minutos assistidos: " + calculardoraDeTempo.getTempoTotalAssistido());
    }
}
