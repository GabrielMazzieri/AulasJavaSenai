package aula06.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double media = 0;

        System.out.println("Digite as quatro notas do aluno para calcular a média (decimais):");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            media = media + notas[i] / 4;
        }

        System.out.println("A média do aluno é " + media);

        scanner.close();
    }
}
