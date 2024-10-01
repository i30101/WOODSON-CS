/*Andrew Kim    27 October 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Board {
    static int spin() {
        return (int) (Math.random() * 6) + 1;
    }

    static int getNewLocation(int previousLocation, int spin) {
        int newLocation = previousLocation + spin;
        if(newLocation > 100) {
            return 100;
        }
        switch(newLocation) {
            case 1: 
                return 38;
            case 4: 
                return 14;
            case 9: 
                return 31;
            case 16: 
                return 6;
            case 21: 
                return 42;
            case 28: 
                return 84;
            case 36: 
                return 44;
            case 47: 
                return 26;
            case 49: 
                return 11;
            case 51: 
                return 67;
            case 56: 
                return 53;
            case 62: 
                return 19;
            case 64: 
                return 60;
            case 71: 
                return 91;
            case 80: 
                return 100;
            case 87: 
                return 24;
            case 93: 
                return 73;
            case 95: 
                return 75;
            case 98: 
                return 78;
        }
        return newLocation;
    }
}