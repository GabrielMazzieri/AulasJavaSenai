package aula05.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resposta;
        do {
            System.out.print("Insira uma nota de 0 a 10: ");
            resposta = scanner.nextInt();
        } while (!(resposta >= 0 && resposta <= 10));
        System.out.println("Nota inserida válida!");

        scanner.close();
    }
}