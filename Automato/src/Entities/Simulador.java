package Entities;

import java.util.List;

public class Simulador {
    private Automato automato;

    public Simulador(Automato automato) {
        this.automato = automato;
    }

    public boolean processarCadeia(String cadeia) {
        String estadoAtual = automato.getEstadoInicial();
        
        for (char simbolo : cadeia.toCharArray()) {
            boolean transicaoEncontrada = false;

            for (Transicao transicao : automato.getTransicoes()) {
                if (transicao.getEstadoOrigem().equals(estadoAtual) && transicao.getSimbolo() == simbolo) {
                    estadoAtual = transicao.getEstadoDestino();
                    transicaoEncontrada = true;
                    break;
                }
            }

            if (!transicaoEncontrada) {
                return false;
            }
        }
        return automato.getEstadosFinais().contains(estadoAtual);
    }

    public void processarTestes(List<String> cadeias) {
        for (String cadeia : cadeias) {
            boolean aceita = processarCadeia(cadeia);
            System.out.println("Cadeia: " + cadeia + " - " + (aceita ? "ACEITA" : "REJEITADA"));
        }
    }
}

