/*Andrew Kim    27 October 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Player {
    private String name;
    private int space;

    public Player(String playerName) {
       name = playerName;
       space = 0;
    }

    public boolean hasWon() {
        if(space == 100) {
            return true;
        }
        return false;
    }

    public void updateSpace(int newSpace) {
        space = newSpace;
    }

    public String getName() {
        return name;
    }

    public int getSpace() {
        return space;
    }

    @Override
    public String toString() {
        return name + " is on " + space;
    }
}
