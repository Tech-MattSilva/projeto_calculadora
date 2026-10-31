package calculadora;

/**
 * Calculadora com as quatro operações básicas para o FinançApp.
 *
 * @author Matheus Silva Trindade de Melo
 * @version 2.0
 */
public class Calculadora {

    /** Operador de soma. */
    private static final String SOMA = "+";

    /** Operador de subtração. */
    private static final String SUBTRACAO = "-";

    /** Operador de multiplicação. */
    private static final String MULTIPLICACAO = "*";

    /** Operador de divisão. */
    private static final String DIVISAO = "/";

    /** Valor retornado quando a operação dá erro. */
    private static final int RESULTADO_EM_CASO_DE_ERRO = 0;

    /**
     * Faz a operação entre dois números inteiros.
     *
     * @param a  primeiro número
     * @param b  segundo número
     * @param op operador (+, -, * ou /)
     * @return o resultado, ou 0 se a operação for inválida
     */
    public int calc(int a, int b, String op) {
        // evita erro no switch caso op seja null
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

    /**
     * Soma dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return a + b
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return a - b
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return a * b
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * @param dividendo número a ser dividido
     * @param divisor   número que divide
     * @return o resultado da divisão, ou 0 se o divisor for zero
     */
    private int dividir(int dividendo, int divisor) {
        // impede a divisão por zero
        if (divisor == 0) {
            return registrarErro("Erro! nao e possivel dividir por zero");
        }
        return dividendo / divisor;
    }

    /**
     * Mostra uma mensagem de erro no console.
     *
     * @param mensagem texto do erro
     * @return sempre 0
     */
    private int registrarErro(String mensagem) {
        System.out.println(mensagem);
        return RESULTADO_EM_CASO_DE_ERRO;
    }
}