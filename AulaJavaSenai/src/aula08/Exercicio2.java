package aula08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio2 {
    public static void main(String[] args) {
        String nomeArquivo = "alunos.txt";

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("Nomes dos alunos no arquivo:");

            while ((linha = leitor.readLine()) != null) {
                    System.out.println(linha);
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
