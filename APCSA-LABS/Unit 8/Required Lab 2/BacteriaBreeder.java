/*Andrew Kim    12 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

import java.util.*;

public class BacteriaBreeder {
    private static int currentHour;
    private static long population;

    private static void newGeneration(int hours) {
        if(currentHour != hours) {
            currentHour++;
            population *= 5;
            newGeneration(hours);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bacteria left on classroom door: ");
        population = input.nextInt();
        currentHour = 0;
        System.out.print("Number of hours passed before doorknob was cleaned: ");
        int hours = input.nextInt();
        newGeneration(hours);
        System.out.println("There were " + population + " bacteria at the time of cleaning");
        input.close();
    }
}
