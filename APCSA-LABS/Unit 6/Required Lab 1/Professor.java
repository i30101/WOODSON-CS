/*Andrew Kim    1 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Professor extends Teacher{
    private String officeNumber;
    private String tenureStatus;

    public Professor(String name, int age, int sal, int years, String sub, String officeNum, boolean status) {
        super(name, age, sal, years, sub);
        officeNumber = officeNum;
        if(status) {
            tenureStatus = "Yes";
        }else {
            tenureStatus = "No";
        }
        setRole("Professor");
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getTenureStatus() {
        return tenureStatus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Office: " + officeNumber + ", Tenure Status: " + tenureStatus;
    }
}
