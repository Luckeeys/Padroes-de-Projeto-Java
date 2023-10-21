package soft.lucas.designpatterns.factorymethod.operacoesmatematicas;

public class Multiplicacao implements Operacao{

    private static Multiplicacao instancia = new Multiplicacao();

    private Multiplicacao() {
        super();
    }

    public static Multiplicacao getInsancia() {
        return instancia;
    }

    @Override
    public String conta(double... numeros) {

        double multiplicacao = 1;

        for (double n: numeros) {
            multiplicacao = multiplicacao * n;
        }

        return "O resultado da multiplicação dos números é: " + multiplicacao;
    }
}
