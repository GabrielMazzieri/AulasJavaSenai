package aula06.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = {"André", "Bernardo", "Caetano"};

        System.out.print("Digite o nome que deseja buscar no vetor: ");
        String busca = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (busca.equalsIgnoreCase(nomes[i])){
                encontrado = true;
                System.out.println("Usuário encontrado!");
                break;
            }
        }

        if (!encontrado){
            System.out.println("Usuário não encontrado!");
        }

        scanner.close();
    }
}
