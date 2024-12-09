package aula02.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando medidas do retângulo
        System.out.print("Bem-vindo à calculadora de área de um retângulo! Defina a largura: ");
        float largura = scanner.nextFloat();
        System.out.print("E a altura: ");
        float altura = scanner.nextFloat();
        // Calculando área
        float area = largura * altura;

        // Exibindo resultado
        System.out.println("A área do retângulo de " + largura + " por " + altura + " é igual a " + area);

        // Fechando scanner
        scanner.close();
    }
}
