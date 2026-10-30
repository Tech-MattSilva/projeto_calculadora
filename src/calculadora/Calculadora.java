package calculadora;

public class Calculadora {

    public int calc(int a, int b, String op) {
        int resultado = 0;

        if (op == null) {
            System.out.println("Operacao invalida! Nenhum operador informado");
            return 0;
        }

        switch (op) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Erro! nao e possivel dividir por zero");
                } else {
                    resultado = a / b;
                }
                break;
            default:
                System.out.println("Operacao invalida: '" + op + "'");
        }

        return resultado;
    }
}
