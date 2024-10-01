/**
 * The CoinSorter class contains a slot for each coin type: penny, nickel, dime, quarter
 * @author Kimberly A. Baram, 11/10/2021
 * @version 1.1, improved to remove redundancy from roll counters
 * @since 1.0
 */
public class CoinSorter{
    
    /**
    * The four coin slots
    */
    private CoinSlot pennySlot, nickelSlot, dimeSlot, quarterSlot;
    
    /**
    * Instantiates the four slots with their respective cent value and number per roll
    */
    public CoinSorter(){
        pennySlot = new CoinSlot(1, 50);
        nickelSlot = new CoinSlot(5, 40);
        dimeSlot = new CoinSlot(10, 50);
        quarterSlot = new CoinSlot(25, 40);
    }
    
    /**
    * Accepts a coin and drops it into the appropriate slot.
    * @param coin the coin type (0 - penny, 1 - nickel, 2 - dime, 3 - quarter
    */
    public void drop(int coin){
        //determine what kind of coin was generated
        switch(coin) {
            case 0: 
                pennySlot.drop();
                break;
            case 1: 
                nickelSlot.drop();
                break;
            case 2: 
                dimeSlot.drop();
                break;
            default:
                quarterSlot.drop();
        }
    }

    
    /**
    * Calculates and returns the total value of all filled rolls
    * @return the total value of all filled rolls
    */
    public int getTotalAmountFilled(){
        return pennySlot.getRollsCompletedValue() + nickelSlot.getRollsCompletedValue() + dimeSlot.getRollsCompletedValue() + quarterSlot.getRollsCompletedValue();
    }
    
    
    /**
    * Returns a string describing the status of each slot and how much total was rolled.
    * @return a string describing the status of each slot and how much total was rolled.
    */
    public String toString(){
        int totalFilled = getTotalAmountFilled();
        return "The pennies slot has " + pennySlot + 
        "\nThe nickels slot has " + nickelSlot + 
        "\nThe dime slot has " + dimeSlot + 
        "\nThe quarter slot has " + quarterSlot + 
        "\nYou have " + (totalFilled / 100) + " dollars and " + (totalFilled % 100) + " cents in full rolls.";
    }
    
}