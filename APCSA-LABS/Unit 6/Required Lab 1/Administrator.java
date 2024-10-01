/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Administrator extends Staff{
    private String department1;
    private String department2;

    public Administrator(String name, int age, int sal, int years, String d1, String d2) {
        super(name, age, sal, years);
        department1 = d1;
        department2 = d2;
        setRole("Administrator");
    }

    public String getDepartment1() {
        return department1;
    }

    public String getDepartment2() {
        return department2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department 1: " + department1 + ", Department 2: " + department2;
    }
}
