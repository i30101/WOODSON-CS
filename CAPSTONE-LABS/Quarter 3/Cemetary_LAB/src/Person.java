/**
 * @author Andrew Kim and Matthew Lee
 * @since 28 January 2025
 * @version 1.0.0
 */


import java.util.Comparator;
import java.time.LocalDate;


public class Person {

    private final String firstName;
    private final String lastName;

    private final int burialDay;
    private final int burialMonth;
    private final int burialYear;

    private final double age;

    private final String address;


    /**
     * Creates Person class
     * @param fn first name
     * @param ln last name
     * @param d burial day
     * @param m burial month
     * @param y burial year
     * @param a age at burial
     * @param ad address
     * @param st street
     * @param stn street number
     */
    public Person(
            String fn, String ln,
            int d, int m, int y,
            double a,
            String ad, String st, String stn
    ) {
        firstName = fn;
        lastName = ln;

        burialDay = d;
        burialMonth = m;
        burialYear = y;

        age = a;

        address = ad;
    }


    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBurialDay() {
        return burialDay;
    }

    public int getBurialMonth() {
        return burialMonth;
    }

    public int getBurialYear() {
        return burialYear;
    }


    /**
     * Burial date format as LocalDate object
     * @return LocalDate object
     */
    public LocalDate getBurialDate() {
        return LocalDate.of(burialYear, burialMonth, burialDay);
    }


    public double getAge() {
        return age;
    }

    public String getAgeString() {
        if (age < 1) {
            return "0";
        } else {
            return String.valueOf((int) (age));
        }
    }

    public String getAddress() {
        return address;
    }


    public static class firstNameComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }


    public static class lastNameComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getLastName().compareTo(p2.getLastName());
        }
    }


    public static class burialDateComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getBurialDate().compareTo(p2.getBurialDate());
        }
    }


    public static class ageComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return Double.compare(p1.getAge(), p2.getAge());
        }
    }


    public static class addressComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p1.getAddress().compareTo(p2.getAddress());
        }
    }





    /**
     * Summarizes person's details
     * @return summary of person
     */
    @Override
    public String toString() {
        return getName() + ", died " + burialMonth + "/" + burialDay + "/" + burialYear + " at age " + getAgeString();
    }
}
