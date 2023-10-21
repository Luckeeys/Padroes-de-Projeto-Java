package soft.lucas.designpatterns.factorymethod.formasgeometricas;

public class Quadrado implements Poligono{

    private static Quadrado instancia = new Quadrado();

    private Quadrado() {
        super();
    }

    public static Quadrado getInstancia() {
        return instancia;
    }

    @Override
    public String getDescricao() {
        return "Quadrilatero";
    }

    @Override
    public String getArea(double... lados) {
        double area = lados[0] * lados[0];

        return "A area do quadrado é: " + area;
    }
}
