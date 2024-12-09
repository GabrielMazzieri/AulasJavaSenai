package aula06.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inteiros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números inteiros para serem somados: ");
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = scanner.nextInt();
            soma = soma + inteiros[i];
        }

        System.out.print("A soma é " + soma);

        scanner.close();
    }
}
