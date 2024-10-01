/*Andrew Kim    13 S
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*;

public class Option2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.next();
        int len = string.length();
        System.out.print("Input a number between 1 and " + (len / 2) + ": ");
        int token = input.nextInt();
        System.out.println(string.substring(len - token, len) + string.substring(token, len - token) + string.substring(0, token));
        
        input.close();
    }
}
