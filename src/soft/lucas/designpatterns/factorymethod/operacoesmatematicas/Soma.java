package soft.lucas.designpatterns.factorymethod.operacoesmatematicas;

public class Soma implements Operacao{

    private static Soma instancia = new Soma();

    private Soma() {
        super();
    }

    public static Soma getInsancia() {
        return instancia;
    }

    @Override
    public String conta(double... numeros) {

        double soma = 0;

        for (double n: numeros) {
            soma += n;
        }

        return "O resultado da soma dos números é: " + soma;
    }
}
