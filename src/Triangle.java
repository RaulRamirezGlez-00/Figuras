
public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double getArea() {
        return (base * height) / 2;
    }

    public void printDimensions() {
        System.out.println("Base: " + base + ", Altura: " + height);
    }
}