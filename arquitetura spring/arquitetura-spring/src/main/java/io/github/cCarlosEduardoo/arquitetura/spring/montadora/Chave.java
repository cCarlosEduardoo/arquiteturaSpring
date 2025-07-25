package io.github.cCarlosEduardoo.arquitetura.spring.montadora;

public class Chave {
    private Montadora montadora;
    private String tipo;

    public Chave(Montadora montadora, String tipo) {
        this.montadora = montadora;
        this.tipo = tipo;
    }

    public Chave(){}

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
