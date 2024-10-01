public class Number {
    private int val;

    public Number() {
        val = (int) (Math.random() * 10);
    }

    public void increment() {
        val++;
    }

    @Override
    public String toString() {
        return "" + val;
    }
}
