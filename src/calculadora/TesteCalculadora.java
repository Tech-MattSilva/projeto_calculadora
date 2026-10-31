package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        testarSoma(calculadora);
        testarSubtracao(calculadora);
        testarMultiplicacao(calculadora);
        testarDivisao(calculadora);
        testarDivisaoPorZero(calculadora);
        testarOperacaoInvalida(calculadora);
    }

    private static void testarSoma(Calculadora calculadora) {
        verificar(calculadora, 7, 5, "+", 12);
    }

    private static void testarSubtracao(Calculadora calculadora) {
        verificar(calculadora, 7, 5, "-", 2);
    }

    private static void testarMultiplicacao(Calculadora calculadora) {
        verificar(calculadora, 7, 5, "*", 35);
    }

    private static void testarDivisao(Calculadora calculadora) {
        verificar(calculadora, 20, 4, "/", 5);
    }

    private static void testarDivisaoPorZero(Calculadora calculadora) {
        verificar(calculadora, 9, 0, "/", 0);
    }

    private static void testarOperacaoInvalida(Calculadora calculadora) {
        verificar(calculadora, 3, 3, "%", 0);
    }

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