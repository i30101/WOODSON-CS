public class CoinSlot {
    int value, capacity, currentCoins, rollsCompleted;

    public CoinSlot(int v, int c) {
        value = v;
        capacity = c;
        currentCoins = 0;
        rollsCompleted = 0;
    }

    public void drop() {
        currentCoins++;
        if(capacity == currentCoins) {
            rollsCompleted++;
            currentCoins = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentCoins() {
        return currentCoins;
    }

    public int getRollsCompleted() {
        return rollsCompleted;
    }

    public int getFullRollValue() {
        return value * capacity;
    }

    public int getRollsCompletedValue() {
        return getFullRollValue() * rollsCompleted;
    }

    public int currentSlotValue() {
        return currentCoins * value;
    }

    @Override
    public String toString() {
        int totalRolled = getRollsCompletedValue();
        return rollsCompleted + " rolls, meaning " + (totalRolled / 100) + " dollars and " + (totalRolled % 100) + " cents rolled, and " + currentCoins + " extra coins.";
    }


}
