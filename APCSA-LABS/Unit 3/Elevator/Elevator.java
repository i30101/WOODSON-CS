public class Elevator {
    private int top, current, passengers, capacity;

    Elevator(int setTop, int setCap) {
        top = setTop;
        current = 1;
        passengers = 0;
        capacity = setCap;
    }

    public int getTop() {
        return top;
    }

    public int getCurrent() {
        return current;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void letOff(int off) {
        passengers -= off;
        if(passengers < 0) {
            passengers = 0;
        }
    }

    public void letOn(int on) {
        passengers += on;
        if(passengers > capacity) {
            passengers = capacity;
        }
    }

    public void moveUp(int up) {
        current += up;
        if(current > top) {
            current = top;
        }
    }

    public void moveDown(int down) {
        current -= down;
        if(current < 1) {
            current = 1;
        }
    }

    @Override
    public String toString() {
        return "Your elevator has " + passengers + " passengers and is on story " + current;
    }
}
