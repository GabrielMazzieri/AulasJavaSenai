package aula03.exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        String texto = "Este texto esta na primeira linha\nEste está na segunda" +
                "mesma linha\n\tEste texto esta na tereira linha e espaçado com tubulação";
        System.out.println(texto);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Seu nome é " + nome +" e você tem "+idade+" anos");
    }
}
