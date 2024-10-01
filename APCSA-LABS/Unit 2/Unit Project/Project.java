/*Andrew Kim    10/21/2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

import java.util.*;

public class Project {
    static void print(int num, String character) {
        for(int i = 1; i <= num; i++) {
            System.out.print(character);
        }
    }

    static void printNorm(int lines, int row, int col, String character, boolean hollow) {
        if(hollow && col != 1 && col != lines && row != 1 && row != lines) {
            System.out.print(" ");
        }else {
            System.out.print(character);
        }
    }

    static void rectangle(int lines, String character, boolean hollow) {
        System.out.println();
        for(int row = 1; row <= lines; row++) {
            for(int col = 1; col <= lines; col++) {
                printNorm(lines, row, col, character, hollow);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rhombus(int lines, String character, boolean hollow, boolean mirrored) {
        System.out.println();
        for(int row = 1; row <= lines; row++) {
            print(mirrored ? (row - 1) : (lines - row), " ");
            for(int col = 1; col <= lines; col++) {
                printNorm(lines, row, col, character, hollow);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pyramid(int lines, String character, boolean hollow, boolean mirrored) {
        System.out.println();
        for(int row = 1; row <= lines; row++) {
            int spaceMax = lines - row, charMax = row * 2 - 1;
            if(mirrored) {
                spaceMax = row - 1;
                charMax = 2 * (lines - row) + 1;
            }
            print(spaceMax, " ");
            for(int col = 1; col <= charMax; col++) {
                if(hollow && col != 1 && col != charMax && row != 1 && row != lines) {
                    System.out.print(" ");
                }else {
                    System.out.print(character);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void halfDiamond(int lines, String character, boolean mirrored) {
        System.out.println();
        int oddLines = (lines % 2 == 0) ? lines - 1 : lines;
        int oddHalf = oddLines / 2;
        for(int row = 1; row <= oddHalf; row++) {
            if(mirrored) {
                print(oddHalf - row + 1, " ");
            }
            print(row, character);
            System.out.println();
        }
        print(oddHalf + 1, character);
        System.out.println();   
        for(int row = oddHalf; row >= 1; row--) {
            if(mirrored) {
                print(oddHalf - row + 1, " ");
            }
            print(row, character);
            System.out.println();
        }
        System.out.println();
    }

    static void plus(int lines, String character) {
        System.out.println();
        int adjusted = (lines % 2 == 0) ? lines - 1 : lines, intHalf = adjusted / 2;
        for(int row = 1; row <= adjusted; row++) {
            if(row == intHalf + 1) {
                print(adjusted, character);
            }else {
                print(intHalf, " ");
                System.out.print(character);
            }
            System.out.println();
        }
        System.out.println();
    }

    static Scanner input = new Scanner(System.in);

    static int getLines() {
        boolean unanswered = true;
        while(unanswered) {
            System.out.print("Desired length of your shape in lines: ");
            int lines = input.nextInt();
            if(lines >= 6) {
                return lines;
            }else {
                System.out.println("Invalid length, please try again.");
            }
        }
        return 6;
    }

    static String getChar() {
        System.out.print("Desired character for your shape: ");
        return input.next().substring(0, 1);
    }

    static boolean getBool(String param) {
        boolean unanswered = true;
        while(unanswered) {
            System.out.print("Type yes if you want your shape to be " + param + ", no if not: ");
            String answer = input.next();
            if(answer.equals("yes")) {
                return true;
            }else if(answer.equals("no")) {
                break;
            }else {
                System.out.println("Invalid response, please try again.");
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println();
        print(38, "*");
        System.out.println("\nWelcome to PATTERN DESIGNER in JAVA!!!");
        print(38, "*");
        boolean running = true;
        while(running) {
            System.out.print(
                "\nEnter 1 to create a rectangle\n" + 
                "Enter 2 to create a rhombus\n" + 
                "Enter 3 to create a pyramid\n" + 
                "Enter 4 to create a half diamond\n" + 
                "Enter 5 to create a plus symbol\n" + 
                "Enter 6 to end program \n" + 
                "\nEnter your command: "
            );
            String choice = input.next();
            if(choice.equals("6")) {
                System.out.println();
                print(40, "*");
                System.out.println("\nYou've exited PATTERN DESIGNER. Goodbye!"); 
                print(40, "*");
                System.out.println("\n");
                running = false;
            }else if(choice.equals("1")) {
                rectangle(getLines(), getChar(), getBool("hollow"));
            }else if(choice.equals("2")) {
                rhombus(getLines(), getChar(), getBool("hollow"), getBool("mirrored"));
            }else if(choice.equals("3")) {
                pyramid(getLines(), getChar(), getBool("hollow"), getBool("mirrored"));
            }else if(choice.equals("4")) {
                halfDiamond(getLines(), getChar(), getBool("mirrored"));
            }else if(choice.equals("5")) {
                plus(getLines(), getChar());
            }else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        input.close();
    }
}
