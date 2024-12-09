package aula02.exemplos;

public class Exemplo4 {
    public static void main(String[] args) {
        // Declarando variáveis
        int num1 = 1, num2 = 1, num3 = 20, num4 = 3;
        boolean resposta;

        // Comparando menor E (&&) diferente
        resposta = num1 < num2 && num3 != num4;
        System.out.println(num1 + " < " + num2 + " && " +
                num3 + " != " + num4 + " = " + resposta);

        // Comparando menor OU (||) diferente
        resposta = num1 < num2 || num3 != num4;
        System.out.println(num1 + " < " + num2 + " || " +
                num3 + " != " + num4 + " = " + resposta);

        // Comparando NÃO (!) igual
        resposta = !(num1 == num2);
        System.out.println("!(" + num1 + " == " + num2 + ") = " + resposta);
    }
}
