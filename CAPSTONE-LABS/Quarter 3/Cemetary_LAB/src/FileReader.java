/**
 * @author Andrew Kim and Matthew Lee
 * @since 27 January 2025
 * @version 1.0.0
 *
 * Cemetery file parser
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class FileReader {


    private static final String[] months = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"
    };


    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * Processes age
     * @param s raw age string
     * @return age in years
     */
    private static double parseAge(String s) {
        if (isInteger(s)) {
            return Double.parseDouble(s);
        } else if (s.contains("d")) {
            double days = Integer.parseInt(s.replace("d", ""));
            return days / 365;
        } else if (s.contains("w")) {
            double weeks = Integer.parseInt(s.replace("w", ""));
            return weeks / 52;
        } else if (s.contains("m")) {
            double months = Integer.parseInt(s.replace("m", ""));
            return months / 12;
        } else {
            return 0;
        }
    }


    /**
     * Creates string from text data
     * @param data string
     * @return complete Person object
     */
    private static Person createPerson(String data) {
        // parse name data
        String nameString = data.substring(0, 25).trim();
        int lastSpaceIndex = nameString.lastIndexOf(" ");
        String firstName = nameString.substring(0, lastSpaceIndex);
        String lastName = nameString.substring(lastSpaceIndex).trim();
        lastName = lastName.charAt(0) + lastName.substring(1).toLowerCase();

        // parse date data
        String dateData = data.substring(25, 42).trim().replace(" ", ",");
        String[] dateArray = dateData.split(",");
        int day = (isInteger(dateArray[0])) ? Integer.parseInt(dateArray[0]) : 1;
        int month = java.util.Arrays.asList(months).indexOf(dateArray[1]) + 1;
        int year = Integer.parseInt(dateArray[2]);
        double age = parseAge(dateArray[3]);

        // parse address data
        String address = data.substring(42);
        lastSpaceIndex = address.lastIndexOf(" ");

        String street;
        String streetNumber;

        if (lastSpaceIndex != -1) {
            street = address.substring(lastSpaceIndex);
            streetNumber = address.substring(0, lastSpaceIndex).trim();
        } else {
            street = address;
            streetNumber = "";
        }




        return new Person(
                firstName, lastName,
                day, month, year,
                age,
                address, street, streetNumber
        );
    }


    /**
     * Parses cemetery file
     * @param filePath path of file to be read
     * @param startLine line number to start parsing
     * @return ArrayList of Person objects
     */
    public static ArrayList<Person> readFile(String filePath, int startLine) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < startLine - 1; i++) {
                scanner.nextLine();
            }

            ArrayList<Person> people = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                people.add(createPerson(data));
            }

            return people;
        } catch (FileNotFoundException e) {
            System.out.println("File reading failed");
            return new ArrayList<>();
        }
    }
}