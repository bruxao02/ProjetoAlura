package br.com.aulas.alura.informacoes;

public class Titulos {

    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes = 0;
    private double totalDeAvaliacoes = 0;

    public void exibeFichaTecnica() {

        System.out.println("Seu nome é: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Soma das avaliações: " + getSomaDasAvaliacoes());
        System.out.println("Duração: " + getDuracaoEmMinutos() + "min");

    }

    public void avalia(double nota) {

        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public void pegaMedia() {

        System.out.println("A Média das avaliações: " + somaDasAvaliacoes / totalDeAvaliacoes);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public double getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

}
