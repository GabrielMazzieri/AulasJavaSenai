package aula04.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargaHoraria = 40;

        System.out.print("Bem-vindo à calculadora de salário! Cada hora equivale a 30 reais, e as horas extras são 50% Digite a quantidade total de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        int horasExtras = horasTrabalhadas >= cargaHoraria ? horasTrabalhadas - cargaHoraria : 0;

        double pagamento = 30 * (horasTrabalhadas + 0.5 * horasExtras);
        System.out.println("Seu pagamento total é " + pagamento);

        scanner.close();
    }
}
