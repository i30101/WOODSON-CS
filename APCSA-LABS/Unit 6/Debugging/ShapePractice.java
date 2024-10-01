public abstract class ShapePractice {
    private String type;
    
    public ShapePractice (String t) {
        type=t;
    }

    public abstract double getArea();
    
    public String toString() {
        return "my shape is a "+type;
    }
}