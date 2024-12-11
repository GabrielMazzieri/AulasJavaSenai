package aula07.desafio;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static String[][] matrizCadastro = {{"", ""}};
    static Scanner scanner = new Scanner((System.in));
    static File arquivoBancoDeDados = new File(System.getProperty("user.home"), "Desafio3" + File.separator + "bancoDeDados.txt");

    public static void main(String[] args) {
        carregarDadosNoArquivo();
        matrizCadastro[0] = cabecalho;

        String menu = """
                _________________________________________
                |   Escolha uma opção:                  |
                |       1 - Exibir Cadastro Completo    |
                |       2 - Cadastrar Usuario           |
                |       3 - Atualizar Usuario           |
                |       4 - Deletar Usuario             |
                |       5 - Sair                        |
                |_______________________________________|
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);

    }

    private static void exibirUsuario() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linha : matrizCadastro) {
            for (int coluna = 0; coluna < linha.length; coluna++) {
                int tamanhoColuna = coluna == 0 ? 5 : (coluna == 2 ? 10 : 25);
                tabela.append(String.format("%-" + tamanhoColuna + "s | ", linha[coluna]));
            }
            tabela.append("\n");
        }
        System.out.println(tabela);
    }

    private static void cadastrarUsuario() {
        System.out.print("Quantas pessoas você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][cabecalho.length];
        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
        }
        System.out.println("Preencha os dados a seguir:");
        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0] + " - " + linha);
            novaMatriz[linha][0] = String.valueOf(linha);

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;

    }

    private static void atualizarUsuario() {
        exibirUsuario();

        System.out.println("\nDigite o id do usuario que deseja atualizar: ");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Atualize as informações a seguir: ");

        System.out.println(cabecalho[0] + " - " + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna] + ": ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        exibirUsuario();
    }

    private static void deletarUsuario() {
        String[][] novaMatriz = new String[matrizCadastro.length - 1][cabecalho.length];
        System.out.println("Digite o Id do usuario para deletar: ");
        int idEscolha = scanner.nextInt();
        scanner.nextLine();
        for (int linha = 0, idNovaMatriz = 0; linha < matrizCadastro.length; linha++) {
            if (linha == idEscolha) {
                continue;
            }
            novaMatriz[idNovaMatriz] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
            novaMatriz[idNovaMatriz][0] = String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }
        matrizCadastro = novaMatriz;
        System.out.println("Usuario deletado com Sucesso!");
        exibirUsuario();
    }

    public static void SalvarDadosNoArquivo() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoBancoDeDados));
            for (String[] linha : matrizCadastro) {
                bufferedWriter.write(String.join(",", linha) + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void carregarDadosNoArquivo() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoBancoDeDados))) {
            if (!arquivoBancoDeDados.exists()) {
                try {
                    if (arquivoBancoDeDados.createNewFile()) {
                        System.out.println("Arquivo" + arquivoBancoDeDados.getName() + "criado com sucesso!");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                String linha;
                StringBuilder conteudoArquivo = new StringBuilder();

                while ((linha = bufferedReader.readLine()) != null) {
                    if (!linha.trim().isEmpty()) {
                        conteudoArquivo.append(linha).append(("\n"));
                    }
                }

                String[] linhaDadosUsuario = conteudoArquivo.toString().split("\n");

                matrizCadastro = new String[linhaDadosUsuario.length][cabecalho.length];

                for (int i = 0; i < linhaDadosUsuario.length; i++) {
                    matrizCadastro[i] = linhaDadosUsuario[i].split(",");
                }

            }
            } catch(IOException e){
            throw new RuntimeException();
        }
    }
}