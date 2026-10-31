package calculadora;

/**
 * Testes da classe Calculadora. Mostra a entrada, o resultado esperado
 * e o resultado obtido de cada caso.
 *
 * @author Matheus Silva Trindade de Melo
 * @version 2.0
 */
public class TesteCalculadora {

    /**
     * Executa todos os testes.
     *
     * @param args não utilizado
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        testarSoma(calculadora);
        testarSubtracao(calculadora);
        testarMultiplicacao(calculadora);
        testarDivisao(calculadora);
        testarDivisaoPorZero(calculadora);
        testarOperacaoInvalida(calculadora);
    }

    /** Testa a soma. */
    private static void testarSoma(Calculadora calculadora) {
        verificar(calculadora, 7, 5, "+", 12);
    }

    /** Testa a subtração. */
    private static void testarSubtracao(Calculadora calculadora) {
        verificar(calculadora, 7, 5, "-", 2);
    }

    /** Testa a multiplicação. */
    private static void testarMultiplicacao(Calculadora calculadora) {
        verificar(calculadora, 7, 5, "*", 35);
    }

    /** Testa a divisão. */
    private static void testarDivisao(Calculadora calculadora) {
        verificar(calculadora, 20, 4, "/", 5);
    }

    /** Testa a divisão por zero. */
    private static void testarDivisaoPorZero(Calculadora calculadora) {
        verificar(calculadora, 9, 0, "/", 0);
    }

    /** Testa um operador inválido. */
    private static void testarOperacaoInvalida(Calculadora calculadora) {
        verificar(calculadora, 3, 3, "%", 0);
    }

    /**
     * Roda o cálculo e compara o obtido com o esperado.
     *
     * @param calculadora calculadora usada no teste
     * @param a           primeiro número
     * @param b           segundo número
     * @param op          operador
     * @param esperado    resultado esperado
     */
    private static void verificar(Calculadora calculadora, int a, int b, String op, int esperado) {
        int obtido = calculadora.calc(a, b, op);

        String status;
        if (obtido == esperado) {
            status = "OK";
        } else {
            status = "FALHOU";
        }

        System.out.println(a + " " + op + " " + b + " | esperado: " + esperado
                + " | obtido: " + obtido + " | " + status);
        System.out.println("---");
    }
}