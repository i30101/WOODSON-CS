/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class HighSchoolStudent extends K12Student {
    private double gpa;

    public HighSchoolStudent(String name, int age, String idNum, int grade, double g) {
        super(name, age, idNum, grade);
        gpa = g;
        setRole("High School Student");
    }
    
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + gpa;
    }
}
