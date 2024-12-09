package aula07.exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int retorno = funcaoComParametroComRetorno(2, 3);
        System.out.println("O resultado é " + retorno);
    }
    private static int funcaoComParametroComRetorno(int number1, int number2){ //nas variáveis temos que especificar o tipo de cada parametro
        return number1 + number2;
    }
}
