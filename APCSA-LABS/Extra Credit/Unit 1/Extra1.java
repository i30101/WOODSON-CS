/*Andrew Kim   26 August 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*;
import java.lang.Math;

public class Extra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int temp = input.nextInt();
        String output = String.valueOf(temp) + " = ";
        String add = " + ";
        if(temp < 0) {
            add = " - ";
            output += "-";
            temp = -temp;
        }
        for(int divisor = (int) Math.pow(10, String.valueOf(temp).length()); divisor > 0; divisor /= 10) {
            if(temp >= divisor) {
                output += (temp / divisor) * divisor + add;
            }
            temp = temp % divisor;
        }
        System.out.print(output.substring(0, output.length() - 3));
        input.close();
    }
}
