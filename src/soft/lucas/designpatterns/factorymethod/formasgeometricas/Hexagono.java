package soft.lucas.designpatterns.factorymethod.formasgeometricas;

public class Hexagono implements Poligono{

    private static Hexagono instancia = new Hexagono();

    private Hexagono() {
        super();
    }

    public static Hexagono getInstancia() {
        return instancia;
    }

    @Override
    public String getDescricao() {
        return "Hexagono";
    }

    @Override
    public String getArea(double... lado) {
        double area = (3 * Math.sqrt(3) * Math.pow(lado[0], 2)) / 2;

        return "A area do Hexagono é de: " + area;
    }
}
