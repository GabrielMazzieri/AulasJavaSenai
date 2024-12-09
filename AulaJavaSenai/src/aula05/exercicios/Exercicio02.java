package aula05.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        while (i < 101){
            soma = soma + i;
            i++;
        }
        System.out.println("A soma de todos os números inteiros de 1 a 100 é " + soma);
    }
}
