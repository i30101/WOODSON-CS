/*Andrew Kim    22 March 2023
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*;

public class JuniorRecords {
    private ArrayList<Student> students;
    private ArrayList<Student> marshals;
    private int lowestIndex;

    public JuniorRecords() {
        students = new ArrayList<Student>();
        marshals = new ArrayList<Student>();
    }
    
    private void sort(ArrayList<Student> s) {
        for(int i = 1; i < s.size(); i++) {
            int n = i;
            while(n > 0 && s.get(n).compareTo(s.get(n - 1)) > 0) {
                s.set(n, s.set(n - 1, s.get(n)));
                n--;
            }
        }
    }

    public void addStudent(Student s) {
        students.add(s);
        if(s.getGpa() >= 3.75) {
            marshals.add(s);
            sort(marshals);
            for(int i = 0; i < marshals.size() - 1; i++) {
                if(marshals.get(i).compareTo(marshals.get(i + 1)) == 0) {
                    lowestIndex = i;
                    break;
                }
            }
            if(marshals.size() > 9) {
                for(int i = marshals.size() - 1; i > 9; i--) {
                    if(marshals.get(i).getGpa() < marshals.get(9).getGpa()) {
                        marshals.remove(i);
                    }
                }
            }
        }
    }
    
    public void printAll() {
        System.out.println("All Students");
        for(Student s : students) {
            System.out.println(s);
        }
    }

    public void printJuniorMarshals() {
        System.out.println("Junior Marshals");
        for(int i = 0; i < marshals.size(); i++) {
            int num = (marshals.size() > 10 && i > lowestIndex) ? lowestIndex : i;
            System.out.println("#" + (num + 1) + ": " + marshals.get(i));
        }
    }
}
