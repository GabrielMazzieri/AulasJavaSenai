package aula05.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        System.out.println("Digite quaisquer 10 números inteiros a seguir:");
        for (int i = 0; i < 10; i++) {
            if (scanner.nextInt() % 2 == 0) pares++;
        }

        System.out.println("Você inseriu " + pares + " números pares e " + (10 - pares) + " ímpares.");

        scanner.close();
    }
}