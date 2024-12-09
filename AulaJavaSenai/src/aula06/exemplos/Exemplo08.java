package aula06.exemplos;

public class Exemplo08 {
    public static void main(String[] args) {
        int[][] numeros = { // Criando e inicializando matriz
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        for (int[] linha : numeros) {
            for (int numero : linha) {
                System.out.println(numero);
            }
        }

        char[][][] letras = { // Matriz tridimensional
                {
                        {'a', 'b', 'c'},
                        {'d', 'e', 'f'}
                }, {
                        {'g', 'h', 'i'},
                        {'j', 'k', 'l'}
                }, {
                        {'l', 'm', 'n'},
                        {'o', 'p', 'q'}
                }
        };
        for (char[][] malha : letras) {
            for (char[] linha : malha) {
                for (char letra : linha) {
                    System.out.println(letra);
                }
            }
        }

        int[][][][] AS = { // Matriz QUADRIDIMENSIONAL
                {
                        {
                                {0000, 0001, 0002},
                                {0010, 0011, 0012},
                                {0020, 0021, 0022}
                        }, {
                                {0100, 0101, 0102},
                                {0110, 0111, 0112},
                                {0120, 0121, 0122}
                        }, {
                                {0200, 0201, 0202},
                                {0210, 0211, 0212},
                                {0220, 0221, 0222}
                        }
                }, {
                        {
                                {1000, 1001, 1002},
                                {1010, 1011, 1012},
                                {1020, 1021, 1022}
                        }, {
                                {1100, 1101, 1102},
                                {1110, 1111, 1112},
                                {1120, 1121, 1122}
                        }, {
                                {1200, 1201, 1202},
                                {1210, 1211, 1212},
                                {1220, 1221, 1222}
                        }
                }, {
                        {
                                {2000, 2001, 2002},
                                {2010, 2011, 2012},
                                {2020, 2021, 2022}
                        }, {
                                {2100, 2101, 2102},
                                {2110, 2111, 2112},
                                {2120, 2121, 2122}
                        }, {
                                {2200, 2201, 2202},
                                {2210, 2211, 2212},
                                {2220, 2221, 2222}
                        }
                }
        };
    }
}
