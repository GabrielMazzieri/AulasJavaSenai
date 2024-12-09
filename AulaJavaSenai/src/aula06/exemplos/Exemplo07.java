package aula06.exemplos;

public class Exemplo07 {
    public static void main(String[] args) {
        int[][] numeros = { // Criando e inicializando matriz
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.println(numeros[linha][coluna]);
            }
        }
    }
}
