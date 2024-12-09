package aula03.exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int varInt = sc.nextInt();
        System.out.println("Seu número é: " + varInt);
        short varShort = (short) varInt;
        System.out.println("VarShort = "+varShort);
        byte varByte = (byte) varShort;
        System.out.println("varByte = "+varByte);

        System.out.print("Digite um numero decimal: ");
        double varDouble = sc.nextDouble();
        System.out.println("Você digitou o numero: " + varDouble);
        float varFloat = (float) varDouble;
        System.out.println("varFloat = " + varFloat);

        varInt = (int) varFloat;
        System.out.println("varInt = " + varInt);

        sc.close();
    }
}
