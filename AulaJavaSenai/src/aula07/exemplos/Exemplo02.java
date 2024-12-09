package aula07.exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        funcaoComParametroSemRetorno(5, "Beatriz");
        Exemplo01.funcaoSemParametoSemRetorno();

    }
    static void funcaoComParametroSemRetorno(int parametro1, String parametro2){
        System.out.println("Parametro 1 = " + parametro1);
        System.out.println("Parametro 2 = " + parametro2);
    }
}
