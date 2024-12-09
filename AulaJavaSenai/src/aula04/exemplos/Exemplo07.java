package aula04.exemplos;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando cor ao usuário
        System.out.print("Insira o valor da compra: ");
        float valorCompra = scanner.nextFloat();
        float valorTotal, desconto = 0.2f;
        //                                |___________ ATRIBUIÇÃO 1 ___________| |_ATRIBUIÇÃO 2_|
        valorTotal = valorCompra > 100f ? valorCompra - (valorCompra * desconto) : valorCompra;
        System.out.println("O valor total de suas compras, podendo estar sujeitas a desconto, é de " + valorTotal + " reais.");

        scanner.close();
    }
}
