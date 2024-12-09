package aula06.exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) { // Usando for para iterar todos valores do vetor
            System.out.println("Elemento [" + i + "] é " + numeros[i]);
        }

        String[] nomes = {"Ana", "Bruno", "Clara"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Elemento [" + i + "] é " + nomes[i]);
        }
    }
}
