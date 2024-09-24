/**
 * @author Andrew Kim, Matthew Lee
 * @since 20 November 2024
 * @version 1.0.0
 */


import java.util.ArrayList;

public class LinkedNode<anyType> {
    private String name;
    private ArrayList<String> neighbors;
    private anyType value;


    public LinkedNode(String n, ArrayList<String> neis, anyType v) {
        name = n;
        neighbors = neis;
        value = v;
    }


    /**
     * Adds new neighbor
     * @param neighbor
     * @return
     */
    public boolean addNeighbor(String neighbor) {
        neighbors.add(neighbor);
        return true;
    }

    /**
     * Adds to collection of neighbors
     * @param neighbors new neighbors to add
     * @return success
     */
    public boolean addNeighbors(ArrayList<String> neighbors) {
        for(String neighbor : neighbors) {
            neighbors.add(neighbor);
        }
        return true;
    }


    /**
     * Whether node neighbors another node
     * @param name of other node
     * @return whether they are neighbors
     */
    public boolean isBordering(String name) {
        return neighbors.contains(name);
    }

    
    /**
     * Number of neighbors node has
     * @return number of neighbors
     */
    public int numNeighbors() {
        return neighbors.size();
    }


    /**
     * Removes node
     * @param name of node to remove
     * @return false if node does not exist
     */
    public boolean removeNeighbor(String name) {
        if (!neighbors.contains(name)) {
            return false;
        }
        neighbors.remove(name);
        return true;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setNeighbors(ArrayList<String> neighbors) {
        this.neighbors = neighbors;
    }


    public void setValue(anyType value) {
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public ArrayList<String> getNeighbors() {
        return neighbors;
    }

    public anyType getValue() {
        return value;
    }

    @Override
    public String toString() {
        String output = name + ", BORDERS: [";
        for (int i = 0; i < neighbors.size(); i++) {
            output += neighbors.get(i);
            if (i != neighbors.size() - 1) {
                output += ", ";
            }
        }
        output += "]\n" + value.toString();
        return output;
    }
}
