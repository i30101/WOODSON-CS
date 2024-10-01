import java.util.List;
import java.util.ArrayList;

/**
 * The TagGame class simulates creating a group of players to play the game of Tag, then running through
 * 10 rounds of the game.
 * @author Kimberly A. Baram & Michael Cortina, adapted from the original work of Rev. Dr. Douglas Oberle
 * @version 1.0
 */

public class TagGame{
   private static List<String> listOfNames = new ArrayList<String>();  //a list containing names of potential game players
   private static TagPlayer[] players;             //an array of the selected/active Tag players
   
   /**
    * Fill listOfNames with potential names for players
    */
   public static void createNames(){
      listOfNames.add("Audrey");
      listOfNames.add("Ned");
      listOfNames.add("Dylon");
      listOfNames.add("Aila");
      listOfNames.add("Abdurahman");
      listOfNames.add("Nina");
      listOfNames.add("Kaja");
      listOfNames.add("Coen");
      listOfNames.add("Niamh");
      listOfNames.add("Lacey");
      listOfNames.add("Teresa");
      listOfNames.add("Piers");
      listOfNames.add("Liberty");
      listOfNames.add("Latisha");
      listOfNames.add("Virgil");
      listOfNames.add("Arthur");
      listOfNames.add("Jibril");
      listOfNames.add("Larissa");
      listOfNames.add("Milana");
      listOfNames.add("Joely");
      listOfNames.add("Zane");
      listOfNames.add("Wanda");
      listOfNames.add("Stuart");
      listOfNames.add("Zakaria");
      listOfNames.add("Jak");
   }
   
   /**
    * Instantiates players with names from listOfNames
    */
   public static void buildTeam(){
      int numPlayers = (int)(Math.random() * 11) + 10;
      players = new TagPlayer[numPlayers];
      for (int i = 0; i < numPlayers; i++){
         int index = (int)(Math.random() * listOfNames.size());
         players[i] = new TagPlayer(listOfNames.remove(index)); //creates a new TagPlayer with the selected name item, then
      }                                                        //removes the name from the list to prevent duplicates
   }
   
   /**
    * Randomly chooses the first player to be IT
    */
   public static void decideWhoIsItFirst(){
      int index = (int)(Math.random() * players.length);
      TagPlayer.tag(players[index]);
   }
   
   /**
    * Displays status of all players
    */
   public static void showPlayers(){
      String out = "STATUS OF PLAYERS: \n";
      for(TagPlayer player : players){
         out += player + "\n";
      }    
      System.out.println(out + "\n");
   }
   
   /**
    * Tags random player who is not already IT, and displays who was tagged
    */ 
   public static void playRound(){
      TagPlayer target = players[(int)(Math.random() * players.length)];
      while (target.getName().equals(TagPlayer.getItPlayer())){
         target = players[(int)(Math.random() * players.length)];
      }
      System.out.println(TagPlayer.tag(target)+ " tags " + target.getName() + " and " + target.getName() + " is now IT!\n");
   }
   
   /**
    * Creates a random group of tag players and simulates 10 rounds,
    * providing the status of each player during the round.
    * @param args not used
    */
   public static void main(String[] args){
      createNames();
      buildTeam();
      decideWhoIsItFirst();
      System.out.println(TagPlayer.getItPlayer() + " is the first one to be IT!\n");
      for (int i = 0; i < 10; i++){
         System.out.println("Round #" + (i + 1));
         playRound();
         showPlayers();
      }
   }
}