/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Teacher extends Staff{
    private String subject;

    public Teacher(String name, int age, int sal, int years, String sub) {
        super(name, age, sal, years);
        subject = sub;
        setRole("Teacher");
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}
