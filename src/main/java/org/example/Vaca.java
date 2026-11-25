package org.example;

public abstract class Vaca extends Animal {
    private String rgn;

    public String getRGN() {
        return rgn;
    }

    public void setRGN(String rgn) {
        this.rgn = rgn;
    }

    @Override
    public String getRaca() {
        return getClass().getSimpleName();
    }

    @Override
    protected String getIdentificacao() {
        return rgn;
    }

    @Override
    protected void setIdentificacao(String identificacao) {
        rgn = identificacao;
    }
}
