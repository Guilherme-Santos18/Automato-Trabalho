package Aplicacao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Entities.ArquivoUtils;
import Entities.Automato;
import Entities.Simulador;

public class Program {
    public static void main(String[] args) {
        try {
            Automato automato = ArquivoUtils.lerAutomato("tests/automato.txt");
            List<String> cadeias = ArquivoUtils.lerTestes("tests/testes.txt");
            
            Simulador simulador = new Simulador(automato);
            List<String> resultados = new ArrayList<>();
            
            for (String cadeia : cadeias) {
                boolean aceita = simulador.processarCadeia(cadeia);
                resultados.add("Cadeia: " + cadeia + " - " + (aceita ? "ACEITA" : "REJEITADA"));
            }
            
            ArquivoUtils.escreverResultado("tests/resultados.txt", resultados);
        } catch (IOException e) {
            System.err.println("Erro ao ler os arquivos: " + e.getMessage());
        }
    }
}
