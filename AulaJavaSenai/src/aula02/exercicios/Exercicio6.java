package aula02.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando um valor decimal ao usuário
        System.out.println("Bem-vindo ao comparador de valores! Digite o valor de dois números em sequência (inteiro): ");
        int num1 = scanner.nextInt(); // Armazenando número 1
        int num2 = scanner.nextInt(); // Armazenando número 2

        // Exibindo comparações
        System.out.println("Segue a lista de comparações:");
        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + " = " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2));
        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " = " + (num1 != num2));

        // Fechando scanner
        scanner.close();
    }
}
