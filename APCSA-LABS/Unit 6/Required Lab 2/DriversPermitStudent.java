/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class DriversPermitStudent implements Gradeable {
    private int points;

    public DriversPermitStudent() {
        points = 100;
    }

    @Override
    public void updateGrade() {
        points -= 4;
    }

    @Override
    public String getScore() {
        return points + "%";
    }

    @Override
    public boolean isPassing() {
        if(points > 80) {
            return true;
        }
        return false;
    }
}
