package aula08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File arquivo = new File("alunos.txt");

        try (FileWriter escritor = new FileWriter(arquivo)) {
            System.out.println("Digite nome de 5 alunos:");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Nome do aluno " + i + ": ");
                String nome = scanner.nextLine();
                escritor.write(nome + "\n");
            }
                System.out.println("Nomes gravados.");
            } catch (IOException e) {
                System.err.println("erro: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("Fim.");
        }
    }
}
