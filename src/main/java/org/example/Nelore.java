package org.example;

public class Nelore extends Vaca {
    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    protected int getMedida() {
        return peso;
    }

    @Override
    protected void setMedida(int medida) {
        peso = medida;
    }

    public void venderConsumo() {
        setPreco(peso * 148.0);
    }
}
