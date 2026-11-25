package org.example;

public class Gir extends Vaca {
    private int producaoLeiteMes;

    public int getProducaoLeiteMes() {
        return producaoLeiteMes;
    }

    public void setProducaoLeiteMes(int producaoLeiteMes) {
        this.producaoLeiteMes = producaoLeiteMes;
    }

    @Override
    protected int getMedida() {
        return producaoLeiteMes;
    }

    @Override
    protected void setMedida(int medida) {
        producaoLeiteMes = medida;
    }

    public void venderConsumo() {
        setPreco(getPreco() + producaoLeiteMes * 20);
    }
}
