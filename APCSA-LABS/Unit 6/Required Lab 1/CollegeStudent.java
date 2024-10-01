/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class CollegeStudent extends Student{
    private double gpa;
    private String major;
    private String studentStatus;

    public CollegeStudent(String name, int age, String idNum, double g, String m, String s) {
        super(name, age, idNum);
        gpa = g;
        major = m;
        studentStatus = s;
        setRole("College Student");
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + gpa + ", Major: " + major + ", Student Status: " + studentStatus;
    }
}
