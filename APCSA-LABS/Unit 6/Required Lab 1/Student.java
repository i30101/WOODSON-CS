/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Student extends SchoolAssociate{
    private String id;

    public Student(String name, int age, String idNum) {
        super(name, age);
        id = idNum;
        setRole("Student");
    }
    
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id;
    }
}
