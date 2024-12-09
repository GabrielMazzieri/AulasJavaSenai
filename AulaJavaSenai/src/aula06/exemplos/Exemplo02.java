package aula06.exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        // Matriz = sequência de vetores
        int[][] matriz = new int[2][3];

        matriz[0][0] = 1; // matriz[i][j] = índices na matriz, bidimensional
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        System.out.println("Elemento na posição [0][2]: " + matriz[0][2]);
    }
}
