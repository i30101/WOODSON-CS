/*Andrew Kim   26 August 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*; 

public class Option1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a name (first, middle last): ");
        String name = input.nextLine();
        String[] names = name.split(" ");
        System.out.println(
            "Initials: " + names[0].charAt(0) + names[1].charAt(0) + names[2].charAt(0) + "\n" + 
            "Rearranged name: " + names[2] + ", " + names[0] + " " + names[1].charAt(0) + "."
        );

        input.close();
    }
}
