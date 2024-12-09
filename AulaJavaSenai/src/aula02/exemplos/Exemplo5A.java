package aula02.exemplos;

public class Exemplo5A {
    public static void main(String[] args) {
        // Casting implícito (maior variável recebe menor variável)
        byte varByte = 127;
        short varShort = varByte;
        int varInt = varShort;
        long varLong = varInt;
        System.out.println("Casting implícito: " + varLong);

        // Casting explícito (menor variável recebe maior variável)
        double varDouble = 4.5;
        varInt = (int) varDouble; // Mantém valor inteiro, valor fracionado perdido
        System.out.println("Casting explícito: " + varInt);

        // Valor errado por não ser suportado pela variável
        varByte = (byte) 150; // byte: -128 a 127
        System.out.println("Valor byte:" + varByte);

        // char: corresponde um número a um caracter pela tabela ASCII
        char varChar = 65; // char 65 = caractere A
        System.out.println("Caractere char: " + varChar);

        // String: objeto que armazena texto
        String varString = "A imagem a seguir é um ascii art de um..." + // Concatenação (+): junta textos
                "\n\tPikachu!\n"; // \n: próxima linha; \t: tabulação
        System.out.println(varString);

        // Aspas triplas: armazena texto exatamente como escrito
        varString = """
                `;-.          ___,
                  `.`\\_...._/`.-"`
                    \\        /      ,
                    /()   () \\    .' `-._
                   |)  .    ()\\  /   _.'
                   \\  -'-     ,; '. <
                    ;.__     ,;|   > \\
                   / ,    / ,  |.-'.-'
                  (_/    (_/ ,;|.<`
                    \\    ,     ;-`
                     >   \\    /
                    (_,-'`> .'
                         (_,'
        """;
        System.out.println(varString);
    }
}
