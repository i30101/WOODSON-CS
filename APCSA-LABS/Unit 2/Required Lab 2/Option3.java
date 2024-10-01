/*Andrew Kim    21 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*;
import java.lang.Math;

public class Option3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;
        while(num < 0) {
            System.out.print("Enter a positive integer: ");
            num = input.nextInt();
        }
        String output = "The narcissistic numbers between less than " + num + " are: ";
        for(int i = 0; i <= num; i++) {
            int temp = i;
            int sum = 0;
            int digits = String.valueOf(i).length();
            for(int divisor = (int) Math.pow(10, digits); divisor > 0; divisor /= 10) {
                sum += Math.pow((temp / divisor), digits);
                temp %= divisor;
            }
            if(sum == i) {
                output += " " + i;
            }
        }
        System.out.println(output);;
        input.close();
    }
}
