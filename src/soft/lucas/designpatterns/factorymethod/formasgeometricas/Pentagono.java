package soft.lucas.designpatterns.factorymethod.formasgeometricas;

public class Pentagono implements Poligono{

    private static Pentagono instacia = new Pentagono();

    private Pentagono() {
        super();
    }

    public static Pentagono getInstancia(){
        return instacia;
    }

    @Override
    public String getDescricao() {
        return "Pentagono";
    }

    @Override
    public String getArea(double... lado) {
        double area = (5 * lado[0] * lado[1]) / 2;

        return "A area do pentagono é: " + area;
    }
}
