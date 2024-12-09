package aula02.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando um valor decimal ao usuário
        System.out.println("Bem-vindo à calculadora de somatória de notas! Digite o valor de três notas em sequência (inteiro): ");
        int nota1 = scanner.nextInt(); // Armazenando nota 1
        int nota2 = scanner.nextInt(); // Armazenando nota 2
        int nota3 = scanner.nextInt(); // Armazenando nota 3

        // Calculando total
        int total = nota1 + nota2 + nota3;

        // Exibindo resultado
        System.out.println("A soma total das notas é " + total + ".");

        // Fechando scanner
        scanner.close();
    }
}
