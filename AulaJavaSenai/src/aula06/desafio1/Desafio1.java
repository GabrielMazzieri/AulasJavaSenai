package aula06.desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pesoas você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"ID", "nome", "Telefone", "Email"};
        String[][] matrizCadastro = new String[qtdPessoas+1][cabecalho.length];
        matrizCadastro[0]=cabecalho;

        for (int linha = 1; linha <= qtdPessoas; linha++) {
            System.out.println("Preencha os dados a seguir: ");
            System.out.println("ID - "+ linha);
            matrizCadastro[linha][0] = String.valueOf(linha);
            System.out.print("Nome: ");
            matrizCadastro[linha][1] = scanner.nextLine();
            System.out.print("Telefone: ");
            matrizCadastro[linha][2] = scanner.nextLine();
            System.out.print("Email : ");
            matrizCadastro[linha][3] = scanner.nextLine();
        }
        String tabela="";
        for(String[] linha : matrizCadastro){
            for(int coluna = 0; coluna < linha.length; coluna++){
                tabela += linha[coluna]+"\t\t";
            }
            tabela +="\n";
        }
        System.out.println(tabela);
    }
}
