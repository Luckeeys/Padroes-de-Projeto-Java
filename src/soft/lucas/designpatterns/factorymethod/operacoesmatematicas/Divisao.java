package soft.lucas.designpatterns.factorymethod.operacoesmatematicas;

public class Divisao implements Operacao{

    private static Divisao instancia = new Divisao();

    private Divisao() {
        super();
    }

    public static Divisao getInsancia() {
        return instancia;
    }

    @Override
    public String conta(double... numeros) {

        double divisao = 0;

        if (numeros[1] != 0) {
            divisao = numeros[0] / numeros[1];
            return "O resultado da divisão é: " + divisao;
        } else {
            return "\n\u001B[31mNão da pra dividir por 0\u001B[0m";
        }
    }
}
