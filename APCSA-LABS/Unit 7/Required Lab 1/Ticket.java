/*Andrew Kim    8 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Ticket {
    private int passenger;
    private String row;
    private int seat;
    private int boardingGroup;

    public Ticket(int p, String r, int s, int b) {
        passenger = p;
        row = r;
        seat = s;
        boardingGroup = b;
    }

    public int getPassenger() {
        return passenger;
    }

    public String getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public int getBoardingGroup() {
        return boardingGroup;
    }

    @Override
    public String toString() {
        return "Passenger #" + passenger + ": Row " + row + ", Seat: " + seat + ", Boarding Group " + boardingGroup;
    }
}