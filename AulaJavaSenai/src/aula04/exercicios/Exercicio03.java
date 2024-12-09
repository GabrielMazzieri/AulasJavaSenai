package aula04.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem-vindo ao categorizador de produtos do Javatacadão! Insira o código de seu produto (códigos válidos de 1 a 3): ");

        switch (scanner.nextInt()){
            case 1:
                System.out.println("Vejo que é um mecatrônico profissional. Você escolheu a categoria 1 de eletrônicos.");
                break;
            case 2:
                System.out.println("Vejo que é a dona da casa. Você escolheu a categoria 2 de alimentos.");
                break;
            case 3:
                System.out.println("Vejo que é uma mulher. Você escolheu a categoria 3 de vestuários caros.");
                break;
            default:
                System.out.println("Javatacadão não tem suporte para outras categorias de produtos. Tente novamente!");
        }

        scanner.close();
    }
}
