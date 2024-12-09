package aula02.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando um valor decimal ao usuário
        System.out.print("Bem-vindo ao processador de casting explícito! Digite um valor decimal (use vírgula como separador decimal): ");
        double varDouble = scanner.nextDouble(); // Armazenando valor na variável

        // Casting explícito
        int varInt = (int) varDouble;

        // Exibindo valor após o casting
        System.out.println("O valor original que você digitou é " + varDouble + ", e o mesmo valor após o casting explícito para inteiro é " + varInt + ".");

        // Fechando scanner
        scanner.close();
    }
}
