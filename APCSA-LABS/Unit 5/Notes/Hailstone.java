public class Hailstone {
    private int number;

    public Hailstone() {
        number = (int) (Math.random() * 100) + 1;
    }

    public Hailstone(int incoming) {
        number = incoming;
        doSequence();
    }

    public int getNumber() {
        return number;
    }

    public void doSequence() {
        if(number % 2 == 0) {
            number /= 2;
        }else {
            number = number * 3 + 1;
        }
    }

    @Override
    public String toString() {
        return number + "";
    }
}
