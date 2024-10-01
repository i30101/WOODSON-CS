/*Andrew Kim    7 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*; 

public class Option2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sphere radius: ");
        double radius = input.nextDouble();
        System.out.println(
            "Diameter: " + (radius * 2) + "\n" + 
            "Circumference: " + (radius * 2 * Math.PI) + "\n" +
            "Surface area: " + (4 * Math.PI * Math.pow(radius, 2)) + "\n" +
            "Volume: " + (4 * Math.PI * Math.pow(radius, 3) / 3)
        );
        input.close();
    }
}