/*Andrew Kim    15 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*;

public class Extra2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.next();
        int len = string.length();
        System.out.print("Input a number between 1 and " + (len / 2) + ": ");
        int token = input.nextInt();
        while(token < 1 || token > len / 2) {
            System.out.print("Number is out of range, type another: ");
            token = input.nextInt();
        }
        System.out.println(string.substring(len - token, len) + string.substring(token, len - token) + string.substring(0, token));
        
        input.close();
    }
}
