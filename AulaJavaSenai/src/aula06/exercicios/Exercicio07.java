package aula06.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma nota de 0 a 10: ");
        int resposta = scanner.nextInt();
        while (!(resposta >= 0 && resposta <= 10)) {
            System.out.print("Nota inserida inválida, tente novamente: ");
            resposta = scanner.nextInt();
        }
        System.out.println("Nota inserida válida!");

        scanner.close();
    }
}