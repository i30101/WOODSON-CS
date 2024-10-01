/*Andrew Kim    1 November 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Battery {
    private Location location;

    public Battery(Location robotLocation) {
        int tempRow = Location.randCoord(), tempCol = Location.randCoord();
        while(tempRow == robotLocation.getRow()) {
            tempRow = Location.randCoord();
        }
        while(tempCol == robotLocation.getColumn()) {
            tempCol = Location.randCoord();
        }
        location = new Location(tempRow, tempCol);
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Battery is at " + location;
    }
}
