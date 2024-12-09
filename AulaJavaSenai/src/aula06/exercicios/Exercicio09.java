package aula06.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = (int) (Math.random() * 100);
        // System.out.println(num);

        do {
            System.out.print("Adivinhe o número gerado aleatoriamente: ");
        } while (scanner.nextInt() != num);

        System.out.println("Você acertou!");

        scanner.close();
    }
}