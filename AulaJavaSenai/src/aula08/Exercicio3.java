package aula08;

import java.io.*;

public class Exercicio3 {
    public static void main(String[] args) {
        String arquivoOrigem = "alunos.txt";
        String arquivoDestino = "backup_alunos.txt";

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {

            String linha;

            System.out.println("Começando a cópia do arquivo...");

            while ((linha = leitor.readLine()) != null) {
                escritor.write(linha);
                escritor.newLine();
            }
            System.out.println("Cópia concluída, arquivo salvo como: " + arquivoDestino);
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
