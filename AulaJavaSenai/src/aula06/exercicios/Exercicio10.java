package aula06.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pares = "";
        String impares = "";

        System.out.println("Insira números inteiros de 0 a 100, até inserir um número negativo: ");
        int num = scanner.nextInt();

        int i = 0;
        while (num >= 0) {
            if (num % 2 == 0) pares = pares + num + ", ";
            else impares = impares + num + ", ";
            i++;
            num = scanner.nextInt();
            if (num > 100) {
                System.out.println("Número muito grande, interrupção realizada.");
                break;
            }
        }

        System.out.print("\nNúmeros pares digitados: " + pares);
        System.out.print("\nNúmeros ímpares digitados: " + impares);

        scanner.close();
    }
}