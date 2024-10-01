public class Collatz {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            Hailstone stone = new Hailstone();
            while(stone.getNumber() != 1) {
                System.out.print(stone + " ");
                stone = new Hailstone(stone.getNumber());
            }
            System.out.println(stone + "\n");
        }
    }
}
