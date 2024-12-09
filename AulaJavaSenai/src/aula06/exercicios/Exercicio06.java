package aula06.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numeros = new int[6][2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digitando números da linha " + i);
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Digite o número na posição " + j);
                numeros[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("""
                    ╔═══════════╗ ╚╝ ║ ╬ ╦ ╠ ╣
                    """);
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }
}
