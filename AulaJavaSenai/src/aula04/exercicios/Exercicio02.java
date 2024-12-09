package aula04.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao caixa do Javatacadão! Insira, em sequência, o valor em reais de suas três compras: ");
        float compra1 = scanner.nextFloat();
        float compra2 = scanner.nextFloat();
        float compra3 = scanner.nextFloat();

        float total = compra1 + compra2 + compra3;
        if (total > 100.0) {
            total = 0.9f * total;
            System.out.println("Parabéns! Você demonstrou ser uma pessoa humilde e foi aplicado um desconto de 10% sobre suas compras. O valor a ser pago agora é " + total + " reais.");
        } else {
            System.out.println("Como um avarento consumidor, você decidiu gastar apenas " + total + " reais em compras. Não haverá desconto.");
        }

        scanner.close();
    }
}
