/**
 * The CarTester class maintains an array of cars and randomly selects one for "car of the year", three times
 * @author Kimberly A. Baram, 11/10/21
 * @version 1.0
 */
public class CarTester{

    /**
     * Outputs all cars in the array
     * @param allCars the array of cars
     */
    private static void showAllCars(Car[] allCars) {
        System.out.println("\nAll Cars:");
        for (Car c : allCars){
            System.out.println(c);
        }
        System.out.println("\n");
    }
    
    
    /**
     * Starts the program, builds the car array, and does 3 random selections
     * for "car of the year"
     * @param args not used
     */
    public static void main(String[] args){
        Car[] collection = {new Car(),
                            new Car("Red Tesla Model T"),
                            new Car("Navy BMW M4"),
                            new Car("Black Audi S6"),
                            new Car("Yellow Ford Pinto"),
                            new Car("White", "Isuzu")};
                           
       
       CarTester.showAllCars(collection);
           
        for(int i = 0; i < 3; i++) {
            System.out.println("Selection #" + (i + 1) + ":");
            int selection = (int)(Math.random() * collection.length);
            
            collection[selection].makeCarOfTheYear();
            CarTester.showAllCars(collection);
            CarOfTheYear.showOff();
        }
    }
}