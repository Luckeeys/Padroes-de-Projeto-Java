package soft.lucas.designpatterns.factorymethod.operacoesmatematicas;

import org.w3c.dom.ls.LSOutput;

public class TestOperacoes {

    public static void main(String[] args) {
        System.out.println("\n1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao");
        Operacao soma = EscolhaOperacao.escolhaOperacao(1);
        System.out.println(soma.conta(1,2,3,4));

        Operacao subtracao = EscolhaOperacao.escolhaOperacao(2);
        System.out.println(subtracao.conta(1,2,3,4));

        Operacao multiplicacao = EscolhaOperacao.escolhaOperacao(3);
        System.out.println(multiplicacao.conta(1,2,3,4));

        Operacao divisao = EscolhaOperacao.escolhaOperacao(4);

        System.out.println(divisao.conta(4, 2));
        System.out.println(divisao.conta(2, 4));
        System.out.println(divisao.conta(2, 0));

        Operacao potencia = EscolhaOperacao.escolhaOperacao(5);

    }


}
