package aula02.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitando carga horária do usuário
        System.out.print("Bem-vindo à calculadora de salário! Por favor, digite sua carga horária: ");
        int hora = scanner.nextInt(); // Armazenando na variável

        // Solicitando pagamento por hora do usuário
        System.out.print("Agora, digite seu pagamento por hora trabalhada em reais: ");
        int pagamentoHora = scanner.nextInt(); // Armazenando na variável

        // Calculando salário total
        int salarioTotal = hora * pagamentoHora;

        // Exibindo resultado
        System.out.println("Seu salário total é " + salarioTotal + " reais por dia.");

        // Fechando scanner
        scanner.close();
    }
}
