/**
 * @author Andrew Kim and Matthew Lee
 * @since 3 February 2025
 * @version 1.0.0
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Cemetery {
    private final ArrayList<Person> people;
    private final double[] ages;

    public Cemetery(String filepath, int startLine) {
        people = FileReader.readFile(filepath, startLine);

        ages = new double[people.size()];
        for (int i = 0; i < people.size(); i++) {
            ages[i] = people.get(i).getAge();
        }
    }


    private double average(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }




    /* ****************************************************************

                                NAME METHODS

     **************************************************************** */

    public ArrayList<Person> hasName(String name) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }

        return result;
    }

    /**
     * Everyone with desired first name
     * @param name desired first name
     * @return list of people with name
     */
    public ArrayList<Person> hasFirstName(String name) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }

        return result;
    }


    /**
     * Everyone with desired last name
     * @param name desired last name
     * @return list of people with name
     */
    public ArrayList<Person> hasLastName(String name) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getLastName().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }

        return result;
    }





    /* ****************************************************************

                                AGE METHODS

     **************************************************************** */


    /**
     * Finds average age
     * @return age
     */
    public double getAverageAge() {
        return average(ages);
    }


    /**
     * Finds mortalities for every year
     * @return Array of [year, mortalities]
     */
    public int[][] yearMortalities() {
        int[] rawYears = new int[people.size()];

        for (int i = 0; i < people.size(); i++) {
            rawYears[i] = people.get(i).getBurialYear();
        }

        Arrays.sort(rawYears);

        int minYear = rawYears[0];
        int maxYear = rawYears[rawYears.length - 1];

        int[][] result = new int[maxYear - minYear + 1][2];

        for (int i = 0; i < (maxYear - minYear + 1); i++) {
            result[i][0] = minYear + i;
        }

        for (Person person : people) {
            result[person.getBurialYear() - minYear][1]++;
        }

        return result;
    }


    public int[] deadliestYear() {
        int[][] mortalities = yearMortalities();

        Arrays.sort(mortalities, Comparator.comparingInt(a -> a[1]));

        return mortalities[mortalities.length - 1];
    }


    public int[] leastDeadlyYear() {
        int[][] mortalities = yearMortalities();

        Arrays.sort(mortalities, Comparator.comparingInt(a -> a[1]));

        return mortalities[0];
    }


    public double maxAge() {
        double[] ages = new double[people.size()];
        for (int i = 0; i < people.size(); i++) {
            ages[i] = people.get(i).getAge();
        }

        Arrays.sort(ages);

        return ages[ages.length - 1];
    }


    /**
     * Finds everyone with a given age
     * @param age given age
     * @return number of people
     */
    public int countIsAge(int age) {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() == age) {
                count++;
            }
        }

        return count;
    }


    /**
     * Everyone with a desired age
     * @param age desired age
     * @return list of people
     */
    public ArrayList<Person> isAge(int age) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() == age) {
                result.add(p);
            }
        }

        return result;
    }


    /**
      * Finds everyone younger than a given age
      * @param age maximum age
      * @return number of people
     */
    public int countYoungerThanAge(int age) {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() < age) {
                count++;
            }
        }

        return count;
    }


    /**
     * Everyone younger than a desired age
     * @param age desired age
     * @return list of people
     */
    public ArrayList<Person> youngerThanAge(int age) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getAge() < age) {
                result.add(p);
            }
        }

        return result;
    }


    /**
     * Finds everyone older than a given age
     * @param age minimum age
     * @return number of people
     */
    public int countOlderThanAge(int age) {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() > age) {
                count++;
            }
        }

        return count;
    }


    /**
     * Everyone older than a desired age
     * @param age desired age
     * @return list of people
     */
    public ArrayList<Person> olderThanAge(int age) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getAge() > age) {
                result.add(p);
            }
        }

        return result;
    }


    /**
     * Counts number of infants (1 year or younger)
     * @return number of infants
     */
    public int countInfants() {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() <= 1) {
                count++;
            }
        }

        return count;
    }


    /**
     * All infants
     * @return list of infants
     */
    public ArrayList<Person> infants() {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getAge() <= 1) {
                result.add(p);
            }
        }

        return result;
    }




    /* ****************************************************************

                                ADDRESS METHODS

     **************************************************************** */


    /**
     * Finds everyone with given address
     * @param address desired address
     * @return list of people with address
     */
    public ArrayList<Person> hasAddress(String address) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getAddress().contains(address)) {
                result.add(p);
            }
        }

        return result;
    }


    /* ****************************************************************

                                SORTING METHODS

     **************************************************************** */


    /**
     * Sorts people by first name
     * @return list of people
     */
    public ArrayList<Person> sortFirstName() {
        people.sort(new Person.firstNameComparator());
        return people;
    }


    /**
     * Sorts people by last name
     * @return list of people
     */
    public ArrayList<Person> sortLastName() {
        people.sort(new Person.lastNameComparator());
        return people;
    }


    /**
     * Sorts people by burial date
     * @return list of people
     */
    public ArrayList<Person> sortBurialDate() {
        people.sort(new Person.burialDateComparator());
        return people;
    }


    /**
     * Sorts people by age
     * @return list of people
     */
    public ArrayList<Person> sortAge() {
        people.sort(new Person.ageComparator());
        return people;
    }


    /**
     * Sorts people by address
     * @return list of people
     */
    public ArrayList<String> sortAddress() {
        people.sort(new Person.addressComparator());

        ArrayList<String> result = new ArrayList<>();
        for (Person p : people) {
            result.add(p.toString() + " " + p.getAddress());
        }

        return result;
    }



    /* ****************************************************************

                                ACCESSOR METHODS

     **************************************************************** */

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Person p : people) {
            output.append(p.toString()).append("\n");
        }

        return output.toString();
    }
}
