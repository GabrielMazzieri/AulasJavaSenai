package aula04.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao determinador de turno do dia! Digite a hora atual (sem minutos): ");
        int hora = scanner.nextInt();

        String turno;
        if (hora >= 5 && hora < 12) turno = "manhã";
        else if (hora >= 12 && hora < 18) turno = "tarde";
        else if (hora >= 18 && hora < 22) turno = "noite";
        else if ((hora >= 22 && hora < 24) || hora < 5) turno = "madrugada";
        else turno = "inválido";

        System.out.println("Seu horário é " + turno + ".");

        scanner.close();
    }
}
