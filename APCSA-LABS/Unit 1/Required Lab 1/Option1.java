/*Andrew Kim    7 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*; 

public class Option1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers: ");
        int red = input.nextInt();
        int blue = input.nextInt();
        int black = input.nextInt();
        int yellow = input.nextInt();
        int pink = input.nextInt();
        int result1 = red + blue;
        int result2 = result1 * black;
        int result3 = result2 - yellow;
        int result4 = result3 / pink;
        System.out.println(
            red + " + " + blue + " = " + result1 + "\n" +
            result1 + " * " + black + " = " + result2 + "\n" +
            result2 + " - " + yellow + " = " + result3 + "\n" +
            result3 + " / " + pink + " = " + result4 + "\n"
        );
        
        input.close();
    }
}