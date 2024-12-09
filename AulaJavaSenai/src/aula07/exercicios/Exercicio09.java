package aula07.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base: ");
        int baseDigitar = scanner.nextInt();
        System.out.print("Digite o valor da potência: ");
        int expoenteDigitar = scanner.nextInt();

        int total = calcularPotencia(baseDigitar, expoenteDigitar);
        System.out.println("A base " + baseDigitar + " elevado à " + expoenteDigitar + " é igual à: " + total);
    }

    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;

        }
        return resultado;
    }

}

