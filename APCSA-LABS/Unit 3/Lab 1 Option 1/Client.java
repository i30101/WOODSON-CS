/*Andrew Kim    27 October 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hi Ho Cherry-O.");
        System.out.print("Player 1 name: ");
        Player player1 = new Player(input.next());
        System.out.print("Player 2 name: ");
        Player player2 = new Player(input.next());
        System.out.println();
        int take;
        while(true) {
            take = Spinner.spin();
            System.out.println(player1.getName() + ": " + Spinner.getMessage());
            player1.updateCherries(take);
            System.out.println(player1);
            if(player1.hasWon()) {
                System.out.println("Congrats, " + player1.getName() + " has won the game!\n");
                break;
            }
            take = Spinner.spin();
            System.out.println(player2.getName() + ": " + Spinner.getMessage());
            player2.updateCherries(take);
            System.out.println(player2);
            if(player2.hasWon()) {
                System.out.println("Congrats, " + player2.getName() + " has won the game!\n");
                break;
            }
        }
        input.close();
    }
}
