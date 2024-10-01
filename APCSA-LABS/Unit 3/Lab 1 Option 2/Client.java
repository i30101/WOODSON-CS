/*Andrew Kim    27 October 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int numPlayers = 0;
        while(numPlayers > 4 || numPlayers < 2) {
            System.out.print("Number of desired players: ");
            numPlayers = input.nextInt();
        }
        Player[] players = new Player[numPlayers];
        for(int i = 0; i < numPlayers; i++) {
            System.out.print("Name of player " + (i + 1) + ": ");
            String name = input.next();
            players[i] = new Player(name);
        }
        boolean playing = true;
        int previousLocation, spin, newLocation;
        while(playing) {
            for(Player player : players) {
                previousLocation = player.getSpace();
                spin = Board.spin();
                System.out.println(player.getName() + " spins: " + spin + ".");
                newLocation = Board.getNewLocation(previousLocation, spin);
                player.updateSpace(newLocation);
                if(newLocation > previousLocation + 6) {
                    System.out.println("Awesome! You jumped from " + previousLocation + " to " + newLocation + ".");
                }else if(newLocation + 6 < previousLocation) {
                    System.out.println("Drats! You were kicked from " + previousLocation + " to " + newLocation + ".");
                }else{
                    System.out.println("You advanced from " + previousLocation + " to " + newLocation + ".");
                }
                if(player.hasWon()) {
                    System.out.println("Great job! " + player.getName() + " has won the game.\n");
                    playing = false;
                    break;
                }
                System.out.println(player + "\n");
            }
        }
        input.close();
    }
}
