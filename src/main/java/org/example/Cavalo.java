package org.example;

public abstract class Cavalo extends Animal {
    private String registro;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String getRaca() {
        return getClass().getSimpleName();
    }

    @Override
    protected String getIdentificacao() {
        return registro;
    }

    @Override
    protected void setIdentificacao(String identificacao) {
        registro = identificacao;
    }
}
