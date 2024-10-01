/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class HighSchoolStudent implements Gradeable{
    private int record;
    private int records;

    public HighSchoolStudent() {
        record = 0;
        records = 0;
        updateGrade();
    }

    private double average() {
        return record / records;
    }

    @Override
    public void updateGrade() {
        int newScore = (int) (Math.random() * 71) + 30;
        if(newScore < 50) {
            record += 50;
        }else {
            record += newScore;
        }
        records++;
    }

    @Override
    public String getScore() {
        return average() + "%";
    }

    @Override
    public boolean isPassing() {
        if(average() > 63.5) {
            return true;
        }
        return false;
    }

}
