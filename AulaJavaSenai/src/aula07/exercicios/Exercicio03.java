package aula07.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número a ser dobrado");
        int resultado = dobrar(scanner.nextInt());
        System.out.println("O resultado é " + resultado);
    }
    public static int dobrar (int number1){
        return number1 * 2;
    }
}
