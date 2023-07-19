package br.com.aulas.alura.informacoes;

public class CalculardoraDeTempo extends Titulos {

    private double tempoTotalAssistido;

    public void assistir(Titulos titulos) {

        this.tempoTotalAssistido += titulos.getDuracaoEmMinutos();

    }

    public double getTempoTotalAssistido() {

        return tempoTotalAssistido;
    }
}
