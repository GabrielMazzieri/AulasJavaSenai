package aula04.exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua idade (inteiro): ");
        int idade = scanner.nextInt();

        if (idade < 0)
            System.out.println("Você não é nascido!");
        else if (idade >= 0 && idade < 13)
            System.out.println("Você é uma criança.");
        else if (idade >= 13 && idade < 18)
            System.out.println("Você é um adolescente.");
        else if (idade >= 18 && idade < 60)
            System.out.println("Você é um adulto.");
        else if (idade >= 60 && idade < 140)
            System.out.println("Você é um idoso.");
        else
            System.out.println("Você está morto.");

        scanner.close();
    }
}
