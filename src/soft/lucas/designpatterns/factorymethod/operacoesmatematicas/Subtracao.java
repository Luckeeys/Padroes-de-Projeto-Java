package soft.lucas.designpatterns.factorymethod.operacoesmatematicas;

public class Subtracao implements Operacao{

    private static Subtracao instancia = new Subtracao();

    private Subtracao() {
        super();
    }

    public static Subtracao getInsancia() {
        return instancia;
    }

    @Override
    public String conta(double... numeros) {

        double subtracao = 0;

        for (double n: numeros) {
            subtracao -= n;
        }

        return "O resultado da subtração dos números é: " + subtracao;
    }
}
