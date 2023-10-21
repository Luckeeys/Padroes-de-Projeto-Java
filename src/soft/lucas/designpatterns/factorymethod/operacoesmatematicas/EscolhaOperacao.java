package soft.lucas.designpatterns.factorymethod.operacoesmatematicas;

public class EscolhaOperacao{
    public static Operacao escolhaOperacao(int operacao) {
        if (operacao == 1) {
            return Soma.getInsancia();
        }
        else if (operacao == 2) {
            return Subtracao.getInsancia();
        }
        else if (operacao == 3) {
            return Multiplicacao.getInsancia();
        }
        else if (operacao == 4) {
            return Divisao.getInsancia();
        } else {
            System.out.println("\u001B[31mDigite uma operação valida");
            System.out.println("\n1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao\u001B[0m");
            System.out.println("\u001B[32mMais operações serão adicionadas posteriormente \u001B[0m");
            return null;
        }
    }
}
