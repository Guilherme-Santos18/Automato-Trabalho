package Entities;

public class Transicao {
    private String estadoOrigem;
    private char simbolo;
    private String estadoDestino;

    public Transicao(String estadoOrigem, char simbolo, String estadoDestino) {
        this.estadoOrigem = estadoOrigem;
        this.simbolo = simbolo;
        this.estadoDestino = estadoDestino;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }
}

