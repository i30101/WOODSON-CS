/*Andrew Kim    1 November 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

import java.util.*;

public class Board {
    static Robot robot;
    static Battery battery;
    static Scanner input;
    static int rows = 8, cols = 8;

    static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    static void printBoard() {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                if(robot.getLocation().getRow() == row && robot.getLocation().getColumn() == col) {
                    if(robot.finished(battery.getLocation())) {
                        System.out.print("! ");
                    }else {
                        System.out.print(robot.getChar() + " ");
                    }
                }else if(battery.getLocation().getRow() == row && battery.getLocation().getColumn() == col) {
                    System.out.print("B ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    static void printMenu() {
        System.out.print(robot + "\n" + battery + 
            "\nEnter a to turn left, d to turn right, or s to move forward: "
        );
        boolean answered = false;
        String answer;
        while(!answered) {
            answer = input.nextLine();
            switch(answer) {
                case("a"):
                    robot.turnLeft();
                    answered = true;
                    break;
                case("d"):
                    robot.turnRight();
                    answered = true;
                    break;
                case("s"):
                    robot.move();
                    answered = true;
                    break;
                default:
                    System.out.print("Invalid input, please try again: ");
            }
        }
    }

    public static void main(String[] args) {
        clear();
        input = new Scanner(System.in);
        System.out.println("Welcome to Robot Deja Vu!");
        System.out.print("Enter robot name: ");
        String name = input.nextLine();
        robot = new Robot(name, 2, 2);
        battery = new Battery(robot.getLocation());
        clear();
        while(!robot.finished(battery.getLocation())) {
            printBoard();
            printMenu();
            clear();
        }
        printBoard();
        System.out.println("You found the battery. Congrats!");
        input.close();
    }
}
