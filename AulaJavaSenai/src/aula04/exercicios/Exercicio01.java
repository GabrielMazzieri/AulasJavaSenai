package aula04.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem-vindo ao site restrito para maiores de idade! Insira a sua idade (em número inteiro): ");
        int idade = scanner.nextInt();

        if (idade >= 18) System.out.println("Ótimo. Como você tem 18 anos ou mais, tem acesso ao sistema.");
        else System.out.println("Desculpe, mas você não tem acesso ao sistema por ser menor de idade.");

        scanner.close();
    }
}
