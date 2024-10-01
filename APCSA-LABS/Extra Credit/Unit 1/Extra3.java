/*Andrew Kim    15 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*; 

public class Extra3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name (first, middle last): ");
        String name = input.nextLine();
        System.out.print("Number of words/phrases in last name: ");
        int lastNames = input.nextInt();
        String[] names = name.split(" ");       
        int len = names.length;

        String initials = "";
        for(String temp: names) {
            char val = temp.charAt(0);
            if(Character.isUpperCase(val)) {
                initials += val;
            }
        }

        String last = "";
        for(int i = len - lastNames; i < len; i++) {
            last += " " + names[i];
        }

        String middle = "";
        for(int i = 1; i < len - lastNames; i++) {
            middle += initials.charAt(i) + ". ";
        }

        System.out.println(
            "Initials: " + initials + "\n" + 
            "Rearranged name:" + last + ", " + names[0] + " " + middle
        );

        input.close();
    }
}
