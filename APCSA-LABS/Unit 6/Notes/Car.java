public class Car extends Vehicle{
    private double odometer;

    public Car(double o) {
        super("Sedan", 4);
        odometer = o;
    }

    public double getOdometer() {
        return odometer;
    }

    public void driveAMile() {
        odometer++;
    }

    @Override
    public String toString() {
        return "Car " + super.getName() + " has " + super.getPassengers() + " passengers and an odometer reading of " + odometer;
    }

}
