package aula05.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as 5 notas do aluno:");
        int media = 0;
        for (int i = 0; i < 5; i++){
            media = scanner.nextInt() + media;
        }
        media = media / 5;

        System.out.println("\nA média das notas do aluno é " + media);

        scanner.close();
    }
}
