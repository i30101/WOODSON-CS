public class HailstoneArrayTester {
    public static void main(String[] args) {
        Hailstone[] stones = new Hailstone[5];
        stones[0] = new Hailstone();
        System.out.print(stones[0] + " ");
        for(int i = 1; i < stones.length; i++) {
            stones[i] = new Hailstone(stones[i - 1].getNumber());
            System.out.print(stones[i] + " ");
        }
        System.out.println();
        for(Hailstone stone : stones) {
            stone.doSequence();
            System.out.print(stone + " ");
        }
    }
}
