public class Vehicle {
    private String name;
    private int passengers;

    public Vehicle(String n, int p) {
        name = n;
        passengers = p;
    }

    public String getName() {
        return name;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Vehicle " + name + " has " + passengers + " passengers";
    }
}
