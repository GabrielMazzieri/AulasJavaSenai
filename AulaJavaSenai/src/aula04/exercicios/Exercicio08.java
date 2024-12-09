package aula04.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao avaliador de desempenho! Digite a sua nota: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Precisa melhorar.");
                break;
            case 2:
                System.out.println("Abaixo da média.");
                break;
            case 3:
                System.out.println("Média.");
                break;
            case 4:
                System.out.println("Acima da média.");
                break;
            case 5:
                System.out.println("Excelente.");
                break;
            default:
                System.out.println("Nota inválida.");
        }

        scanner.close();
    }
}
