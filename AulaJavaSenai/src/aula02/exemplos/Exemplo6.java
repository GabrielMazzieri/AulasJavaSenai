package aula02.exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);


        // Solicitando um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int varInt = scanner.nextInt();

        // Exibindo número digitado
        System.out.println("Você digitou o número: " + varInt + "\n");

        // Casting explícito
        short varShort = (short) varInt;
        byte varByte = (byte) varShort;

        // Exibindo número digitado
        System.out.println("varShort: " + varShort);
        // Exibindo casting de valores
        System.out.println("varByte: " + varByte + "\n");


        // Solicitando um número decimal ao usuário
        System.out.print("Digite um número decimal: ");
        double varDouble = scanner.nextDouble();

        // Exibindo número digitado
        System.out.println("Você digitou o número: " + varDouble + "\n");

        // Casting explícito
        float varFloat = (float) varDouble;
        varInt = (int) varFloat;

        // Exibindo casting de valores
        System.out.println("varFloat: " + varFloat);
        System.out.println("varInt: " + varInt);


        // Fechando Scanner
        scanner.close();
    }
}
