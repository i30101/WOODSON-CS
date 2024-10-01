public abstract class Shape {
    private String type;

    public Shape(String t) {
        type = t;
    }

    public abstract double getArea();

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "My shape is a " + type;
    }

}