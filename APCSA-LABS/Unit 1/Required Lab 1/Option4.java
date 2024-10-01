/*Andrew Kim    7 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*; 

public class Option4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put in the values of your standard form equation. \nEnter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        System.out.print("Enter C: ");
        int c = input.nextInt();
        System.out.println("Slope-intercept equation: y = " + ((double) -a / b) + "x + " + ((double) c / b));
        
        input.close();
    }
}