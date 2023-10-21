package soft.lucas.designpatterns.factorymethod.formasgeometricas;

public class FabricaPoligonos {
    public static Poligono createPoligono(int numeroLados) {
        if (numeroLados == 3) {
            return Triangulo.getInstancia();
        } else if (numeroLados == 4) {
            return Quadrado.getInstancia();
        } else if (numeroLados == 5) {
            return Pentagono.getInstancia();
        } else if (numeroLados == 6) {
            return Hexagono.getInstancia();
        } else {
            System.out.println("\n\u001B[31mDigite o numero de lados de um poligono valido 3 a 6");
            System.out.println("Mais poligonos serão adicionados posteriormente\u001B[0m");
            return null;
        }
    }
}
