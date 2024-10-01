/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class K12Student extends Student {
    private int gradeLevel;

    public K12Student(String name, int age, String idNum, int grade) {
        super(name, age, idNum);
        gradeLevel = grade;
        setRole("K-12 Student");
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade Level: " + gradeLevel;
    }
}