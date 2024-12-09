package aula02.exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        // Declarando e inicializando String
        String varString = "Este texto está na primeira linha.\nEste texto está na segunda linha." +
                " Aqui continua na mesma linha.\n\tEste texto está na terceira linha, com tabulação!";

        // Exibindo String
        System.out.println(varString);

        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando a idade do usuário
        System.out.print("\nDigite sua idade: ");
        int idade = scanner.nextInt();

        // Espera próxima linha
        scanner.nextLine();

        // Solicitando o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Exibindo valores
        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos.");

        // Fechando Scanner
        scanner.close();
    }
}
