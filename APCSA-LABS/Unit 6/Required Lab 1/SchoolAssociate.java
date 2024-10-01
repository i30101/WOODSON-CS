/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class SchoolAssociate {
    private String name;
    private String role;
    private int age;

    public SchoolAssociate(String n, int a) {
        name = n;
        age = a;
        setRole("School Associate");
    }

    public void setRole(String r) {
        role = r;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }   

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Role: " + role;
    }
}