/**
 * The TagPlayer class keeps track of a player in the game of tag, including their name and whether they are "IT"
 * @author Kimberly A. Baram and Michael Cortina, adapted from the original work of Rev. Dr. Douglas Oberle
 * @version 1.0
 */

public class TagPlayer{

   private static String whoIsIt; /*name of the player in the game who is "IT"*/
   
   private String name;  /*name of this player*/
   
   /**
    * Constructs a new TagPlayer with name n. At time of construction this player is not "IT"
    * @param n the name of this player
    */
   public TagPlayer(String n){
      name = n;
   }
   
   /**
    * initializes the IT player
    * @param p the player who will be IT
    */
   public static void initializeIt(TagPlayer p){
      whoIsIt = p.name;
   }
   
   /**
    * @return the name of the IT player
    */
   public static String getItPlayer(){
      return whoIsIt;
   }
   
   /**
    * Removes IT status from this player and transfers it to the opponent
    * @param opponent the player who was tagged and is now IT
    * @return name of the player who was it
    */
   public static String tag(TagPlayer opponent){
      String retVal = whoIsIt;
      whoIsIt = opponent.name;
      return retVal;
   }
   
   /**
    * @return the name of this player
    */
   public String getName(){
      return name;
   }
   
   /**
    * @return a string with this players name, along with a note as to whether
    * they are it, or if they are running from the IT player
    */
   public String toString(){
      String retVal = name ;
      if (name.equals(whoIsIt)){
         retVal += " IS IT!";
      }
      else{
         retVal += " is running from " + whoIsIt + "!";
      }
      return retVal;   
   }
}