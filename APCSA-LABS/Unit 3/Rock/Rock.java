public class Rock {
    private String group, naturalColor, paintColor;
    private double weight;

    public Rock() {
        group = "igneous";
        naturalColor = "brown";
        paintColor = "none";
        weight = 0.5;
    }

    public Rock(String g, String n, String p, double w) {
        group = g;
        naturalColor = n;
        paintColor = p;
        weight = w;
    }

    public String getGroup() {
        return group;
    }

    public String getNaturalColor() {
        return naturalColor;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public double getWeight() {
        return weight;
    }

    public void paint(String color) {
        paintColor = color;
    }

    public void breakInHalf() {
        weight /= 2;
    }

    public void chiselAway(double amount) {
        if(amount < weight) {
            weight -= amount;
        }else {
            weight = 0.0000001;
        }
    }

    public Rock divide() {
        breakInHalf();
        return new Rock(group, naturalColor, paintColor, weight);
    }

    @Override
    public String toString() {
        return "Rock group: " + group + 
        "\nNatural color: " + naturalColor + 
        "\nPaintec color: " + paintColor + 
        "\nWeight: " + weight + "pounds";
    }

}