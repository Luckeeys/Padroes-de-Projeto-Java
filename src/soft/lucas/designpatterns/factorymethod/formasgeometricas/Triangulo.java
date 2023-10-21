package soft.lucas.designpatterns.factorymethod.formasgeometricas;

public class Triangulo implements Poligono{

    private static Triangulo instancia = new Triangulo();

    private Triangulo() {
        super();
    }

    public static Triangulo getInstancia() {
        return instancia;
    }

    @Override
    public String getDescricao() {
        return "Triangulo";
    }

    @Override
    public String getArea(double... lados) {
        double lado1 = lados[0];
        double lado2 = lados[1];
        double lado3 = lados[2];

        if ( (lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado3 + lado2) > lado1) {
            double semiperimetro = (lado1 + lado2 + lado3) / 2;
            double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

            return "A area do triangulo é de: " + area;
        } else {
            return "Os lados não correspondem a um triangulo";
        }
    }
}
