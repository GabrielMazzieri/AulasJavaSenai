package aula04.exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int x = scanner.nextInt();

        // Estrutura de decisão
        if (x >= 30) // if: executa um código caso a condição seja verdadeira
            System.out.println("O número " + x + " é maior ou igual a 30.");
        else // else: executa outro código caso a mesma condição não seja verdadeira
            System.out.println("O número " + x + " é menor que 30.");

        scanner.close();
    }
}
