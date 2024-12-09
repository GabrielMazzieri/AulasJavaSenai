package aula02.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando um valor float ao usuário
        System.out.print("Bem-vindo ao conversor de casting explícito/implícito! Digite seu valor float: ");
        float varFloat = scanner.nextFloat();
        // Casting explícito
        long varLong = (long) varFloat;
        // Casting implícito
        double varDouble = varLong;

        // Exibindo valores
        System.out.println("Valor da variável float: " + varFloat);
        System.out.println("Valor da variável long: " + varLong);
        System.out.println("Valor da variável double: " + varDouble);

        // Fechando scanner
        scanner.close();
    }
}