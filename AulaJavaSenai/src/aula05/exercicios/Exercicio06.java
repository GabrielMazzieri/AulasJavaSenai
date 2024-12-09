package aula05.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos números deseja calcular na sequência de Fibonacci:");
        int num = scanner.nextInt();

        System.out.println("A sequência de Fibonacci é ");

        int a = 1;
        System.out.print(a + ", ");
        int b = 1;
        System.out.print(b + ", ");
        int c, i = 0;

        while (i < num - 2) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
            i++;
        }

        scanner.close();
    }
}
