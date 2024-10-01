/*Andrew Kim    1 November 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Robot {
    private String name;
    private Location location;
    private int direction;      // 0: west  1: north  2: east  3: south

    Robot(String robotName) {
        name = robotName;
        location = new Location();
        direction = 1;
    }

    Robot(String robotName, int row, int col) {
        name = robotName;
        location = new Location(row, col);
        direction = 1;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getDirection() {
        switch(direction) {
            case 0:
                return "west";
            case 1:
                return "north";
            case 2:
                return "east";
            default:
                return "south";
        }
    }

    public void turnLeft() {
        direction = (direction == 0) ? 3 : direction - 1;
    }

    public void turnRight() {
        direction = (direction == 3) ? 0 : direction + 1;
    }

    public void move() {
        switch(direction) {
            case 0:
                location.moveLeft();
                break;
            case 1:
                location.moveUp();
                break;
            case 2:
                location.moveRight();
                break;
            default:
                location.moveDown();
        }
    }

    public String getChar() {
        switch(direction) {
            case 0:
                return "<";
            case 1: 
                return "^";
            case 2:
                return ">";
            default:
                return "v";
        }
    }

    public boolean finished(Object ob) {
        return location.equals(ob);
    }

    @Override
    public String toString() {
        return "Robot " + name + " is at " + getLocation() + " and facing " + getDirection();
    }
}
