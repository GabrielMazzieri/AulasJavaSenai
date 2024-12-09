package aula02.exemplos;

import java.util.Scanner;

public class Exemplo5B {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);


        // Solicitando um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int varInt = scanner.nextInt();
        // Casting implícito
        long varLong = varInt;
        float varFloat = varInt;
        double varDouble = varInt;

        // Exibindo o número digitado
        System.out.println("Você digitou o número: " + varInt + "\n");

        // Exibindo o casting de valores
        System.out.println("varLong: " + varLong);
        System.out.println("varFloat: " + varFloat);
        System.out.println("varDouble: " + varDouble + "\n");


        // Solicitando um número decimal ao usuário
        System.out.print("Digite um número decimal: ");
        varFloat = scanner.nextFloat();
        // Casting implícito
        varDouble = varFloat;

        // Exibindo o número digitado
        System.out.println("Você digitou o número: " + varFloat + "\n");
        // Exibindo o casting de valores
        System.out.println("varDouble: " + varDouble);


        // Fechando o Scanner
        scanner.close();
    }
}
