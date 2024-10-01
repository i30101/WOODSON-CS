/**
 * The CarOfTheYear class stores information on one car that is currently the car of the year
 * @author Kimberly A. Baram, 11/10/2001
 * @version 1.0
 */

public class CarOfTheYear{
   /**
    * The car of the year
    */
   private static Car theCar;  //initially null

   /**
    * Sets the new car of the year.
    * @param c the new car of the year
    */
   public static void set(Car c){
        if (theCar != null){
            theCar.modifyCarOfYear();  //sets old car of year status to false
        }
        theCar = c; //set the new car of the year
   }
   
   /**
    * Prints a reminder of the car of the year
    */
    public static void showOff(){
        if (theCar != null){
            System.out.println("By the way did you know the car of the year? " + theCar.toString().toUpperCase() + "\n\n");
        }
    }
}