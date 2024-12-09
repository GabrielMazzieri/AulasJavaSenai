package aula04.exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 'verde', 'vermelho' ou 'amarelo' para a cor do semáforo: ");
        String corSemaforo = scanner.nextLine();

        switch (corSemaforo.toLowerCase()) {
            case "verde": // Caso a cor seja verde
                System.out.println("Sinal verde! Prossiga.");
                break;
            case "amarelo": // Caso a cor seja amarela
                System.out.println("Sinal amarelo! Atenção.");
                break;
            case "vermelho": // Caso a cor seja vermelha
                System.out.println("Sinal vermelho! Pare.");
                break;
            default: // O padrão caso nenhuma das anteriores
                System.out.println("Não existe a cor " + corSemaforo.toLowerCase() + " em um semáforo!");
        }

        scanner.close();
    }
}
