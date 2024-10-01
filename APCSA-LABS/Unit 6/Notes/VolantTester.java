public class VolantTester {
    public static void main(String[] args) {
        Volant[] flyingThings = new Volant[2];
        Mosquito bob = new Mosquito();
        Jet blue = new Jet();

        bob.beAnnoying();
        blue.serveSnacks();
        flyingThings[0] = bob;
        flyingThings[1] = blue;
        flyingThings[0].takeOff();
        flyingThings[1].takeOff();
    }

    public static void fly(Volant v) {
        v.takeOff();
        v.land();
        v.takeOff();
    }
}
