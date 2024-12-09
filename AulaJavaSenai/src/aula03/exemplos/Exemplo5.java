package aula03.exemplos;
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        long varLong = numero;
        float varFloat = numero;
        double varDouble = numero;
        System.out.println("O número é: " + numero);
        System.out.println("varLong é: " + varLong);
        System.out.println("varFloat é: " + varFloat);
        System.out.println("varDouble é: " + varDouble);

        System.out.println("Digite um número decimal: ");
        varFloat = sc.nextFloat();
        System.out.println("Você digitou: : " + varFloat);

        varDouble = varFloat;
        System.out.println("Você digitou: : " + varDouble);

    }
}
