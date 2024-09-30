/*Andrew Kim    8 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

import java.util.ArrayList;

public class TicketDriver {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        String[] rows = {"A", "B", "C", "D", "E", "F"};
        for(int i = 0; i < 15; i++) {
            String row = rows[(int) (Math.random() * rows.length)];
            Ticket t = new Ticket(i + 1, row, (int) (Math.random() * 8) + 1, (int) (Math.random() * 5) + 1);
            tickets.add(i, t);
        }
        for(int i = 1; i <= 5; i++) {
            System.out.println("\nBoarding Group " + i + ":");
            for(Ticket t : tickets) {
                if(t.getBoardingGroup() == i) {
                    System.out.println(t);
                }
            }
        }

        ArrayList<ArrayList<Ticket>> master = new ArrayList<ArrayList<Ticket>>();
        for(int i = 1; i <= 5; i++) {
            for(String row : rows) {
                ArrayList<Ticket> sameBoarding = new ArrayList<Ticket>();
                for(Ticket t : tickets) {
                    if(t.getBoardingGroup() == i && t.getRow().equals(row)) {
                        sameBoarding.add(t);
                    }
                }
                if(sameBoarding.size() > 1) {
                    master.add(sameBoarding);
                }
            }
        }

        if(master.size() >= 1) {
            System.out.println("\n\nPassengers who can board together: ");
            for(ArrayList<Ticket> sameBoarding : master) {
                for(Ticket t : sameBoarding) {
                    System.out.println(t);
                }
            }
        }else {
            System.out.println("\n\nNo passengers can board together.");
        }
    }
}
