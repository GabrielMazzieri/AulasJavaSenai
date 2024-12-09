package aula04.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem-vindo à calculadora de comissão! Insira o valor de suas vendas em reais: ");
        float vendas = scanner.nextFloat();
        int comissaoPct;

        if (vendas < 1000) comissaoPct = 5;
        else if (vendas >= 1000 && vendas <= 5000) comissaoPct = 10;
        else comissaoPct = 15;

        System.out.println("\nO valor total de sua comissão é " + comissaoPct + " porcento.");

        scanner.close();
    }
}
