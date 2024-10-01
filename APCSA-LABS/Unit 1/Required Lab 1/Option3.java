/*Andrew Kim    7 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*; 

public class Option3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int temp = input.nextInt();
        String output = String.valueOf(temp) + " = ";
        int place = String.valueOf(temp).length() - 1;
        for(int i = place; i > -1; i--) {
            int divisor = (int) Math.pow(10, i);
            if(temp >= divisor) {
                output += (temp / divisor) * divisor + " + ";
            }
            temp = temp % divisor;
        }
        System.out.print(output.substring(0, output.length() - 3));        
        input.close();
    }
}