package Entities;

import java.util.HashSet;
import java.util.Set;

public class Automato {
    private Set<String> estados;
    private Set<Transicao> transicoes;
    private String estadoInicial;
    private Set<String> estadosFinais;

    public Automato() {
        this.estados = new HashSet<>();
        this.transicoes = new HashSet<>();
        this.estadosFinais = new HashSet<>();
    }

    public void adicionarEstado(String estado) {
        estados.add(estado);
    }

    public void adicionarTransicao(Transicao transicao) {
        transicoes.add(transicao);
    }

    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public void adicionarEstadoFinal(String estadoFinal) {
        estadosFinais.add(estadoFinal);
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public Set<String> getEstadosFinais() {
        return estadosFinais;
    }

    public Set<Transicao> getTransicoes() {
        return transicoes;
    }
}
