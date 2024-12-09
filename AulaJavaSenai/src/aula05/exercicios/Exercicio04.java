package aula05.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean primo = true;

        System.out.println("Digite o número que deseja verificar se é primo:");
        int num = scanner.nextInt();

        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) System.out.println("O número é primo.");
        else System.out.println("O número não é primo.");

        scanner.close();
    }
}
