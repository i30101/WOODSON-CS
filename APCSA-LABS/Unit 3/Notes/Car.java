/**
 * The Car class stores a description of the car and whether it is the car of the year.
 * This class is intended to showcase the various uses for the keyword "this"
 * @author Kimberly A. Baram, 11/10/21
 * @version 1.0
 */

public class Car{
    private String description;
    private boolean carOfYear; 
    
    /**
     * Constructs a silver Honda Civic
     */
    public Car(){
        this("Silver Honda Civic");
    }
    
    /**
     * Constructs a pickup truck with the specified make and model
     */
    public Car(String color, String make){
        this(color + " " + make + " Pickup");
    }
    
    /**
     * Constructs a car with a customized color, make and model
     */
    public Car(String desc){
    this.description = desc;
    this.carOfYear = false;
    }
    
    /**
     * Inverts the car's car of year status
     */
    public void modifyCarOfYear(){
        this.carOfYear = !(this.carOfYear);
    }
    
    /**
     * Makes this car the car of the year
     */
    public void makeCarOfTheYear(){
        CarOfTheYear.set(this);  //set is a static method in the CarOfTheYear class
        this.modifyCarOfYear();
        System.out.println(this.description + " has been named the car of the year!");
    }
    
    /**
     * Describes the color, make and model of the car and whether it is car of the year
     * @return a string as described in the method description
     */
    public String toString(){
        return this.description + " is " + (this.carOfYear ? "" : "not ") + "car of the year.";
    }
}