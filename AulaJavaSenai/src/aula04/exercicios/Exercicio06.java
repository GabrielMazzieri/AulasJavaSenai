package aula04.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao determinador de aprovação de aluno! Digite a nota do aluno: ");
        int nota = scanner.nextInt();

        String aprovacao;
        if (nota >= 7) aprovacao = "aprovado";
        else if (nota >= 5) aprovacao = "em recuperação";
        else aprovacao = "reprovado";

        System.out.println("O aluno com esta nota está " + aprovacao + ".");

        scanner.close();
    }
}
