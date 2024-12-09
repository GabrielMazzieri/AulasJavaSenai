package aula02.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando um valor decimal ao usuário
        System.out.println("Bem-vindo ao comparador de condições! Insira as condições em sequência (true ou false): ");
        boolean cond1 = scanner.nextBoolean(); // Armazenando comparação 1
        boolean cond2 = scanner.nextBoolean(); // Armazenando comparação 2
        boolean cond3 = scanner.nextBoolean(); // Armazenando comparação 3

        System.out.println("\nSegue a lista de comparações usando os operadores lógicos E (&&) e OU (||)");
        // Comparação E (&&)
        System.out.println(cond1 + " && " + cond2 + " = " + (cond1 && cond2));
        System.out.println(cond2 + " && " + cond3 + " = " + (cond2 && cond3));
        System.out.println(cond1 + " && " + cond3 + " = " + (cond1 && cond3) + "\n");

        // Comparação OU (||)
        System.out.println(cond1 + " || " + cond2 + " = " + (cond1 || cond2));
        System.out.println(cond2 + " || " + cond3 + " = " + (cond2 || cond3));
        System.out.println(cond1 + " || " + cond3 + " = " + (cond1 || cond3));

        // Fechando scanner
        scanner.close();
    }
}
