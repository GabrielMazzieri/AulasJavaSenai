package aula02.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando idade do usuário
        System.out.print("Bem-vindo ao monitor de informações! Por favor, digite sua idade em anos (inteiro): ");
        int idade = scanner.nextInt(); // Armazenando na variável

        // Solicitando altura do usuário
        System.out.print("Digite sua altura em metros (use a vírgula como separador decimal) : ");
        float altura = scanner.nextFloat(); // Armazenando na variável

        // Solicitando peso do usuário
        System.out.print("Digite seu peso em quilogramas (use a vírgula como separador decimal): ");
        double peso = scanner.nextDouble(); // Armazenando na variável

        // Exibindo valores
        System.out.println("Sua idade é " + idade + " anos, sua altura é " + altura + " metros e seu peso é " + peso + " quilogramas.");

        // Fechando scanner
        scanner.close();
    }
}
