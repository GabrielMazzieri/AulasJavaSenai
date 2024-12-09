package aula05.exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                ╔════════════════════════════════════════════════╗
                ║                      MENU                      ║
                ║                                                ║
                ║   Seja muito mais que bem-vindo!               ║
                ║                                                ║
                ║   Escolha uma opção:                           ║
                ║                                                ║
                ║   (1) Para opção número 1                      ║
                ║   (2) Para opção número 2                      ║
                ║   (3) Para opção número 3                      ║
                ║   (4) Para sair do programa                    ║
                ║                                                ║
                ║  © Todos créditos reservados                   ║
                ╚════════════════════════════════════════════════╝
                """);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.print("\nPerfeito! Você escolheu a opção 1.");
                break;
            case 2:
                System.out.print("\nPerfeito! Você escolheu a opção 2.");
                break;
            case 3:
                System.out.print("\nPerfeito! Você escolheu a opção 3.");
                break;
            case 4:
                System.out.print("\nEspero te ver novamente! Você escolheu sair.");
                break;
            default:
                System.out.println("\nInsira uma opção válida!");
        }

        scanner.close();
    }
}
