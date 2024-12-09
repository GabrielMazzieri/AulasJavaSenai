package aula02.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando um valor inteiro ao usuário
        System.out.print("Bem-vindo ao processador de casting implícito! Digite um valor inteiro: ");
        int varInt = scanner.nextInt(); // Armazenando valor na variável

        // Casting implícito
        double varDouble = varInt;

        // Exibindo valor após o casting
        System.out.println("O valor do inteiro após o casting implícito para double é " + varDouble);

        // Fechando scanner
        scanner.close();
    }
}
