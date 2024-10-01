/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Staff extends SchoolAssociate {
    private int yearsWorked;
    private int salary;

    public Staff(String name, int age, int sal, int years) {
        super(name, age);
        yearsWorked = years;
        salary = sal;
        setRole("Staff");
    }
    
    public int getYearsWorked() {
        return yearsWorked;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Years Worked: " + yearsWorked + ", Salary: " + salary;
    }
}
