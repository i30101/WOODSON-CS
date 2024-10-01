/*Andrew Kim    27 October 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Spinner {
    private static String message;

    static int spin() {
        switch((int) (Math.random() * 7 + 1)) {
            case 1:
                message = "Take 1 cherry from the tree";
                return 1;
            case 2:
                message = "Take 2 cherries from the tree";
                return 2;
            case 3:
                message = "Take 3 cherries from the tree";
                return 3;
            case 4: 
                message = "Take 4 cherries from the tree";
                return 4;
            case 5: 
                message = "Oh no, a dog has come and eaten 3 of your cherries";
                return -3;
            case 6:
                message = "Oh no, a bird has come and eaten 2 of your cherries";
                return -2;
            case 7: 
                message = "Oh no, your basket spilled! ";
                return -10;
        }
        return 0;
    }

    public static String getMessage() {
        return message;
    }
}
