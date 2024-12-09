package aula05.exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o número para calcular a tabuada: ");
        int x = scanner.nextInt();

        while (x > 214748364) {
            System.out.print("\nNúmero inserido inválido! Apenas números inteiros até 214748364 são aceitos. Tente novamente: ");
            x = scanner.nextInt();
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("\t" + x + " * " + i + " = " + (x * i));
        }

        scanner.close();
    }
}
