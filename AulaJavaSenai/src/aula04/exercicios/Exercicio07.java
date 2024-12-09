package aula04.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora simples! Digite dois números em sequência que deseja calcular: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("""
                Agora, digite o número correspondente à operação que deseja realizar:
                    1 - Soma
                    2 - Sutração
                    3 - Multiplicação
                    4 - Divisão
                """);
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Subtração: " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Sua resposta é inválida.");
        }

        scanner.close();
    }
}
