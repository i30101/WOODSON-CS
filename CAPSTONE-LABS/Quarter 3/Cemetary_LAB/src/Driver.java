/**
 * @author Andrew Kim and Matthew Lee
 * @since 30 January 2025
 * @version 1.0.0
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Driver {
    private static Cemetery cemetery;
    private static Scanner scanner;


    private static final String INSTRUCTIONS = """
            \s
            \s
            1. Show people in cemetery
            2. Search for people in cemetery
            3. Get age and death data
            0. Exit
           \s
            Enter your choice:\s""";


    /**
     * Gets user choice
     * @param options acceptable letters
     * @return chosen letter
     */
    private static String getChoiceLetter(String[] options) {
        String input = "";
        while (!Arrays.asList(options).contains(input)) {
            input = scanner.nextLine();
        }
        return input;
    }


    /**
     * Prints all elements inside ArrayList
     * @param list list to be printed
     * @param <E> data type
     */
    private static <E> void printArrayList(ArrayList<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    }


    /**
     * Prints number of mortalities for every year
     */
    private static void printYearMortalities() {
        int[][] mortalities = cemetery.yearMortalities();

        for (int[] mortality : mortalities) {
            System.out.println("Year: " + mortality[0] + "\t" + "Mortalities: " + mortality[1]);
        }
    }


    /**
     * Show people in cemetery
     */
    private static void choice1() {
        System.out.println("""
                                \s
                                \s
                                a. Everyone ordered by last name
                                b. Everyone ordered by first name
                                c. Everyone ordered by burial date
                                d. Everyone ordered by age
                                e. Everyone ordered by address
                                """);

        String input = getChoiceLetter(new String[]{"a", "b", "c", "d", "e"});

        switch (input) {
            case "a" -> printArrayList(cemetery.sortLastName());
            case "b" -> printArrayList(cemetery.sortFirstName());
            case "c" -> printArrayList(cemetery.sortBurialDate());
            case "d" -> printArrayList(cemetery.sortAge());
            default -> printArrayList(cemetery.sortAddress());
        }
    }


    /**
     * Search for people in cemetery
     */
    private static void choice2() {
        System.out.println("""
                \s
                \s
                 a. Everyone with a desired name
                 b. Everyone with a desired first name
                 c. Everyone with a desired last name
                 d. Everyone with a given address
                 e. Everyone with a given age
                 f. Everyone older than a given age
                 g. Everyone younger than a given age
                 h. Every infant
                 i. Everyone on a given street
                \s""");

        ArrayList<Person> searchResults = cemetery.infants();

        String input = getChoiceLetter(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});

        if (!input.equals("h")) {
            System.out.print("Enter your search query: ");

            String searchInput = scanner.nextLine();

            try {
                int searchNumber = Integer.parseInt(searchInput);
                switch (input) {
                    case "e" -> searchResults = cemetery.isAge(searchNumber);
                    case "f" -> searchResults = cemetery.olderThanAge(searchNumber);
                    case "g" -> searchResults = cemetery.youngerThanAge(searchNumber);
                }
            } catch (Exception e) {
                switch (input) {
                    case "a" -> searchResults = cemetery.hasName(searchInput);
                    case "b" -> searchResults = cemetery.hasFirstName(searchInput);
                    case "c" -> searchResults = cemetery.hasLastName(searchInput);
                    case "i" -> searchResults = cemetery.hasAddress(searchInput);
                }
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("No results found");
        } else {
            printArrayList(searchResults);
        }
    }


    /**
     * Get age and death data
     */
    private static void choice3() {
        System.out.println("""
                            \s
                            \s
                            a. Average age of death
                            b. Deadliest year
                            c. Least deadly year
                            d. Max age
                            e. Count number with given age
                            f. Count number older than a given age
                            g. Count number younger than a given age
                            h. Count infants
                            i. Annual fatalities
                            """);

        String input = getChoiceLetter(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});

        if (input.equals("e") || input.equals("f") || input.equals("g")) {
            System.out.print("Enter your search query: ");

            String searchInput = scanner.nextLine();

            try {
                int searchNumber = Integer.parseInt(searchInput);

                switch (input) {
                    case "e" -> System.out.println("Number of people " + searchNumber + " years old: " + cemetery.countIsAge(searchNumber));
                    case "f" -> System.out.println("Number of people older than " + searchNumber + " years: " + cemetery.countOlderThanAge(searchNumber));
                    case "g" -> System.out.println("Number of people younger than " + searchNumber + " years: " + cemetery.countYoungerThanAge(searchNumber));
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        } else {
            switch (input) {
                case "a":
                    System.out.println(cemetery.getAverageAge());
                    break;
                case "b":
                    int[] deadliestYear = cemetery.deadliestYear();
                    System.out.println("Deadliest year: " + deadliestYear[0] + ", fatalities: " + deadliestYear[1]);
                    break;
                case "c":
                    int[] leastDeadlyYear = cemetery.leastDeadlyYear();
                    System.out.println("Least deadly year: " + leastDeadlyYear[0] + ", fatalities: " + leastDeadlyYear[1]);
                    break;
                case "d":
                    System.out.println("Max age: " + cemetery.maxAge());
                    break;
                case "h":
                    System.out.print("Number of infants: " + cemetery.countInfants());
                    break;
                case "i":
                    printYearMortalities();
                    break;
                default:
                    System.out.println("Invalid input, please try again");
            }
        }
    }



    public static void main(String[] args) {
        cemetery = new Cemetery("./data/cemetery_orig.txt", 5);
        scanner = new Scanner(System.in);

        boolean playing = true;

        System.out.println("**************** Welcome to the cemetery!! ****************");

        String input;

        while (playing) {
            System.out.print(INSTRUCTIONS);

            input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1 -> choice1();
                    case 2 -> choice2();
                    case 3 -> choice3();
                    case 0 -> playing = false;
                    default -> System.out.println("Invalid input, please try again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please try again");
            }
        }
    }
}
