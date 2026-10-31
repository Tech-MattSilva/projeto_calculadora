package calculadora;

public class Calculadora {

    public int calc(int a, int b, String op) {
        
        if (op == null) {
            return erro("Operacao invalida! Nenhum operador informado");
        }

        switch (op) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                return erro("Operacao invalida: '" + op + "'");
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
            return erro("Erro! nao e possivel dividir por zero");
        }
        return a / b;
    }

    private int erro(String mensagem) {
        System.out.println(mensagem);
        return 0;
    }
}