package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String dono;
    private double preco;
    private final List<AnimalEstado> estados = new ArrayList<>();

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.preco = preco;
    }

    public abstract String getRaca();

    protected abstract String getIdentificacao();

    protected abstract void setIdentificacao(String identificacao);

    protected abstract int getMedida();

    protected abstract void setMedida(int medida);

    public void salvarEstado() {
        estados.add(new AnimalEstado(getClass().getSimpleName(), dono, preco,
                getIdentificacao(), getMedida()));
    }

    public void restaurarEstado(int indice) {
        if (indice < 0 || indice >= estados.size()) {
            throw new IllegalArgumentException("Índice inválido");
        }

        AnimalEstado estado = estados.get(indice);
        dono = estado.getDono();
        preco = estado.getPreco();
        setIdentificacao(estado.getIdentificacao());
        setMedida(estado.getMedida());
    }

    public List<AnimalEstado> getEstados() {
        return List.copyOf(estados);
    }
}
