package aula02.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando um valor float ao usuário
        System.out.print("Bem-vindo ao conversor de casting implícito/explícito! Digite seu valor short: ");
        short varShort = scanner.nextShort();
        // Casting implícito
        int varInt = varShort;
        // Casting explícito
        byte varByte = (byte) varShort;

        // Exibindo valores
        System.out.println("Valor da variável short: " + varShort);
        System.out.println("Valor da variável int: " + varInt);
        System.out.println("Valor da variável byte: " + varByte);

        // Fechando scanner
        scanner.close();
    }
}
