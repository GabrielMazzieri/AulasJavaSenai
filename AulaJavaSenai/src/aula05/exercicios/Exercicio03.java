package aula05.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que deseja calcular o fatorial (deve ser inteiro):");
        int num = scanner.nextInt();

        int i = num;
        do {
            i--;
            num = num * i;
        } while(i > 2);

        System.out.println("O resultado do fatorial é " + num);

        scanner.close();
    }
}
