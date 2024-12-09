package aula04.exemplos;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando cor ao usuário
        System.out.print("Insira um valor inteiro: ");
        int x = scanner.nextInt();
        boolean r;

        // Operador ternário
        r = x > 50 ? true : false; // Os valores entre os pontos são possíveis atribuições à variável
        System.out.println("O resultado para a expressão " + x + " > 50 é " + r);

        scanner.close();
    }
}
