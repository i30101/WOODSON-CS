/*Andrew Kim    22 March 2023
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

public class Student implements Comparable {
    private String name;
    private double gpa;

    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Object o) {
        double other = ((Student) o).getGpa();
        if(gpa > other) {
            return 1;
        }else if(gpa == other) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name + " has GPA " + gpa;
    }

}

