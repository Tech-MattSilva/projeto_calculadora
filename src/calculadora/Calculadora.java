package calculadora;

public class Calculadora {

    private static final String SOMA = "+";
    private static final String SUBTRACAO = "-";
    private static final String MULTIPLICACAO = "*";
    private static final String DIVISAO = "/";

    private static final int RESULTADO_EM_CASO_DE_ERRO = 0;

    public int calc(int a, int b, String op) {
        if (op == null) {
            return registrarErro("Operacao invalida! Nenhum operador informado");
        }

        switch (op) {
            case SOMA:
                return somar(a, b);
            case SUBTRACAO:
                return subtrair(a, b);
            case MULTIPLICACAO:
                return multiplicar(a, b);
            case DIVISAO:
                return dividir(a, b);
            default:
                return registrarErro("Operacao invalida: '" + op + "'");
        }
    }

    private int somar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            return registrarErro("Erro! nao e possivel dividir por zero");
        }
        return a / b;
    }

    private int registrarErro(String mensagem) {
        System.out.println(mensagem);
        return RESULTADO_EM_CASO_DE_ERRO;
    }
}