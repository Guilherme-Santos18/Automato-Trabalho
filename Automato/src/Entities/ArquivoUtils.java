package Entities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtils {
    public static Automato lerAutomato(String caminhoArquivo) throws IOException {
        Automato automato = new Automato();
        BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;

        while ((linha = reader.readLine()) != null) {
            
        }

        reader.close();
        return automato;
    }

    public static List<String> lerTestes(String caminhoArquivo) throws IOException {
        List<String> testes = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;

        while ((linha = reader.readLine()) != null) {
            testes.add(linha);
        }

        reader.close();
        return testes;
    }

    public static void escreverResultado(String caminhoArquivo, List<String> resultados) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));

        for (String resultado : resultados) {
            writer.write(resultado);
            writer.newLine();
        }

        writer.close();
    }
}
