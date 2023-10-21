package soft.lucas.designpatterns.factorymethod.formasgeometricas;

public class TestPoligonos {
    public static void main(String[] args) {
        // Triangulo
        Poligono triangulo = FabricaPoligonos.createPoligono(3);

        System.out.println(triangulo.getDescricao());
        System.out.println(triangulo.getArea(1, 2, 3));

        // Quadrado
        Poligono quadrado = FabricaPoligonos.createPoligono(4);

        System.out.println(quadrado.getDescricao());
        System.out.println(quadrado.getArea(4));

        // Pentagono
        Poligono pentagono = FabricaPoligonos.createPoligono(5);

        System.out.println(pentagono.getDescricao());
        System.out.println(pentagono.getArea(6, 8)); //passar a apotema como segundo parametro

        // Hexagono
        Poligono hexagono = FabricaPoligonos.createPoligono(6);

        System.out.println(hexagono.getDescricao());
        System.out.println(hexagono.getArea(7));

        // Heptagono - Como exemplo de erro, pois não existe subclasse para um pentagono
        Poligono heptagono = FabricaPoligonos.createPoligono(7);
    }
}
