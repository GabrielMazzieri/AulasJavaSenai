package aula07.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para calcular seu fatorial: ");
        int numero = calcularFatorial(scanner.nextInt());
        System.out.println("O resultado é " + numero);

    }
    public static int calcularFatorial(int fatorial) {
        int resultado = 1;
        do {
            resultado = resultado * fatorial;
            fatorial--;
        } while (fatorial > 1);

        return resultado;
    }

}
