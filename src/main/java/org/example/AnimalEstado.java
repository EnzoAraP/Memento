package org.example;

public class AnimalEstado {
    private final String tipo;
    private final String dono;
    private final double preco;
    private final String identificacao;
    private final int medida;

    public AnimalEstado(String tipo, String dono, double preco, String identificacao, int medida) {
        this.tipo = tipo;
        this.dono = dono;
        this.preco = preco;
        this.identificacao = identificacao;
        this.medida = medida;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getPreco() {
        return preco;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public int getMedida() {
        return medida;
    }
}
