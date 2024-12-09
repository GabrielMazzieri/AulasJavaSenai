package aula06.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[6];
        strings[0] = "B";
        strings[1] = "R";
        strings[2] = "A";
        strings[3] = "Y";
        strings[4] = "A";
        strings[5] = "N";

        System.out.println("Procure uma letra no vetor: ");
        String busca = scanner.next();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == busca){
                System.out.println("Letra encontrada na " + i + "° posição do vetor.");
            }
        }

        scanner.close();
    }
}
