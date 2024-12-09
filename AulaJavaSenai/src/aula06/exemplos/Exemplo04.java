package aula06.exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int[][] numeros = { // Criando e inicializando matriz
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        System.out.println("Valor da posição [2][1] é " + numeros[2][1]);

        String[][] nomes = {{"Ana", "Bruno"}, {"Clara", "Douglas"}}; // Matriz com String
        System.out.println("Nome da posição [2][1] é " + nomes[1][1]);
    }
}
