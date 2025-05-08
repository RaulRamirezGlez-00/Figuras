
public class Main {
    public static void main(String[] args) {
        // Se crea un triangulo para probar
        Shape myTriangle = new Triangle(10, 5);

        // Como usamos la interfaz Shape, para poder aplicarlo en otras figuras 
        System.out.println("Área del triángulo: " + myTriangle.getArea());

        if (myTriangle instanceof Triangle) {
            ((Triangle) myTriangle).printDimensions();
        }
    }
}