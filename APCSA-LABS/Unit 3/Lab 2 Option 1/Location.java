/*Andrew Kim    1 November 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Location {
    private int row, column;

    static int randCoord() {
        return (int) (Math.random() * 8);
    }

    static void pause() {
        try {
            Thread.sleep(500);
        }catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    Location() {
        row = randCoord();
        column = randCoord();
    }

    Location(int newRow, int newColumn) {
        row = newRow;
        column = newColumn;
    }

    public void moveUp() {
        if(row == 0) {
            System.out.println("You cannot move up.");
            pause();
        }else {
            row--;
            System.out.println();
        }
    }

    public void moveDown() {
        if(row == 7) {
            System.out.println("You cannot move down.");
            pause();
        }else {
            row++;
        }
    }

    public void moveRight() {
        if(column == 7) {
            System.out.println("You cannot move right.");
            pause();
        }else {
            column++;
        }
    }

    public void moveLeft() {
        if(column == 0) {
            System.out.println("You cannot move left.");
            pause();
        }else {
            column--;
        }
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "row " + row + ", column " + column;
    }

    @Override
    public boolean equals(Object ob) {
        if(!(ob instanceof Location)) {
            return false;
        }
        Location other = (Location) ob;
        if(this.row == other.row && this.column == other.column) {
            return true;
        }
        return false;
    }
}