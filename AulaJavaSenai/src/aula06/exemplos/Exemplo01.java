package aula06.exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        // Vetor = sequência de valores
        int[] numeros = new int[5]; // new = constrói o objeto (reserva memória para o vetor)

        numeros[0] = 10; // vetor[i] = índice no vetor, 0 é o primeiro
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Primeiro elemento: " + numeros[0]);
    }
}
