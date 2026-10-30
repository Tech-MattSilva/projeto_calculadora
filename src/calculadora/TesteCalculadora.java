package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testar(calc, 7, 5, "+", 12);
        testar(calc, 7, 5, "-", 2);
        testar(calc, 7, 5, "*", 35);
        testar(calc, 20, 4, "/", 5);
        testar(calc, 9, 0, "/", 0);   // divisao por zero
        testar(calc, 3, 3, "%", 0);   // operacao invalida
    }

    static void testar(Calculadora calc, int a, int b, String op, int esperado) {
        int obtido = calc.calc(a, b, op);
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