package aula04.exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n\tDigite 1 para opção 1;\n\tDigite 2 para opção 2;\n\tDigite 3 para opção 3;");
        System.out.print("Digite aqui: ");
        byte opcao = scanner.nextByte();

        switch (opcao) {
            case 1: // Caso a cor seja verde
                System.out.println("Como um ordinário usuário, você escolheu a opção 1. Parabéns.");
                break;
            case 2: // Caso a cor seja amarela
                System.out.println("Ótima escolha! Você escolheu a opção 2.");
                break;
            case 3: // Caso a cor seja vermelha
                System.out.println("Magnífico! Você provou ser alguém extraordinário ao escolher a opção 3!");
                break;
            default: // O padrão caso nenhuma das anteriores
                System.out.println("A opção " + opcao + " não está listada.");
        }

        scanner.close();
    }
}
