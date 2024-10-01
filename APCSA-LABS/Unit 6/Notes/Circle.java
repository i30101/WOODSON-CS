public class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        super("Circle");
        radius = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " with a radius of " + radius;
    }

}
