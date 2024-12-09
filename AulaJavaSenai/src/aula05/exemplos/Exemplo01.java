package aula05.exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        // Estrutura de repetição
        while (idade < 18) { // Verifica, depois itera
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println(idade);
        }

        System.out.println("Você finalmente é maior de idade.");
        scanner.close();
    }
}
