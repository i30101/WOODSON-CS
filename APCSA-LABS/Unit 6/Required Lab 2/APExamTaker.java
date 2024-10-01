/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class APExamTaker implements Gradeable {
    private int rawScore;

    public APExamTaker() {
        rawScore = 0;
    }

    private int apScore() {
        if(rawScore > 61) {
            return 5;
        }else if(rawScore > 46) {
            return 4;
        }else if(rawScore > 36) {
            return 3;
        }else if(rawScore > 28) {
            return 2;
        }
        return 1;
    }

    @Override
    public void updateGrade() {
        rawScore++;
    }

    @Override
    public String getScore() {
        return apScore() + "";
    }

    @Override
    public boolean isPassing() {
        if(apScore() >= 3) {
            return true;
        }
        return false;
    }
}
