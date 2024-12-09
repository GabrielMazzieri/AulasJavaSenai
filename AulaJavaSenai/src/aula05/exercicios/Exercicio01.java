package aula05.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números que deseja começar/terminar a contagem regressiva:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println();
        if (num1 > num2) {
            for (int i = num1; i > (num2 - 1); i--) {
                System.out.println(i);
            }
        } else {
            for (int i = num2; i > (num1 - 1); i--) {
                System.out.println(i);
            }
        }

        System.out.println("Fim!");

        scanner.close();
    }
}
