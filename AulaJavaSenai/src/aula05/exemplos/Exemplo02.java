package aula05.exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        // Estrutura de repetição
        do { // Executa uma vez...
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println(idade);
        } while (idade < 18); // ... e depois verifica

        System.out.println("Você finalmente é maior de idade.");

        scanner.close();
    }
}
