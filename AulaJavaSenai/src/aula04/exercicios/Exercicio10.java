package aula04.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de moeda local! Digite o valor em reais: ");
        double valor = scanner.nextDouble();

        System.out.println("""
                Agora selecione o número corresponde a qual moeda deseja converter:
                    1 - Dólar;
                    2 - Euro;
                    3 - Libra;
                """);

        double resultado;
        switch (scanner.nextInt()) {
            case 1:
                resultado = valor / 5.69;
                System.out.println("O valor convertido é " + resultado + " dólares");
                break;
            case 2:
                resultado = valor / 6.17;
                System.out.println("O valor convertido é " + resultado + " euros");
                break;
            case 3:
                resultado = valor / 7.39;
                System.out.println("O valor convertido é " + resultado + " libras");
                break;
            default:
                System.out.println("Item inválido.");
        }

        scanner.close();
    }
}
