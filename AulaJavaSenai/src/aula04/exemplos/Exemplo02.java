package aula04.exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 'verde', 'vermelho' ou 'amarelo': ");
        String corSemaforo = scanner.nextLine();

        if (corSemaforo.toLowerCase().equals("verde")) // Se a cor for verde
            System.out.println("Sinal verde! Prossiga.");
        else if (corSemaforo.toLowerCase().equals("amarelo")) // Se a cor for amarela
            System.out.println("Sinal amarelo! Atenção.");
        else if (corSemaforo.toLowerCase().equals("vermelho")) // Se a cor for vermelha
            System.out.println("Sinal vermelho! Pare.");
        else // Se nenhuma das anteriores
            System.out.println("Você não digitou uma resposta válida.");

        scanner.close();
    }
}
