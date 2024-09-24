/**
 * @author Andrew Kim, Matthew Lee
 * @since 20 November 2024
 * @version 1.0.0
 */


import java.util.ArrayList;

public class Webable<anyType> implements LinkedWeb<anyType> {
    private ArrayList<LinkedNode<anyType>> board;


    public Webable() {
        clear();
    }

    /**
     * Adds new node to web
     * @param name
     * @param neighbors
     * @param value
     * @return if successful
     */
    public boolean add(String name, ArrayList<String> neighbors, anyType value) {
        board.add(new LinkedNode<anyType>(name, neighbors, value));
        return true;
    }


    /**
     * Adds neighbors to existing neighbor
     * @param name of node
     * @param neighbors to add
     * @return false if node does not exist
     */
    public boolean addNeighbors(String name, ArrayList<String> neighbors) {
        if (!contains(name)) {
            return false;
        }
        get(name).addNeighbors(neighbors);
        for (String neighbor : neighbors) {
            if (contains(neighbor)) {
                get(neighbor).addNeighbor(name);
            }
        }
        return true;
    }


    /**
     * Checks if two nodes are neighbors
     * @param name1
     * @param name2
     * @return whether nodes are neighbors
     */
    public boolean areNeighbors(String name1, String name2) {
        if (!contains(name1) || !contains(name2)) {
            return false;
        }
        LinkedNode<anyType> node1 = get(name1);
        LinkedNode<anyType> node2 = get(name2);
        if (node1.isBordering(name2) != node2.isBordering(name2)) {
            System.out.println("error with neighbors");
            return false;
        }
        return node1.isBordering(name2);
    }

    
    /**
     * Clears existing data
     */
    public void clear() {
        board = new ArrayList<LinkedNode<anyType>>();
    }


    /**
     * Checks if web contains node
     * @param name
     * @return whether web contains node
     */
    public boolean contains(String name) {
        for (LinkedNode<anyType> node : board) {
            if (node.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Gets node with given name
     * @param name of node to find
     * @return null if node cannot be found
     */
    public LinkedNode<anyType> get(String name) {
        for(LinkedNode<anyType> node : board) {
            if (node.getName().equals(name)) {
                return node;
            }
        }
        return null;
    }


    /**
     * Sets new node for existing name
     * @param name
     * @param neighbors
     * @param value
     * @return
     */
    public LinkedNode<anyType> set(String name, ArrayList<String> neighbors, anyType value) {
        if (!contains(name)) {
            return null;
        }
        LinkedNode<anyType> node = get(name);
        node.setName(name);
        node.setNeighbors(neighbors);
        node.setValue(value);
        return node;
    }


    /**
     * Shows unlinked nodes
     * @return
     */
    public String showUnlinked() {
        String output = "";
        for (LinkedNode<anyType> node : board) {
            output += node.toString() + "\n";
        }
        return output;
    }


    /**
     * Finds number of nodes
     * @return number of nodes in web
     */
    public int size() {
        return board.size();
    }
    

    /**
     * Converts nodes to array
     * @return array of nodes
     */
    public Object[] toArray() {
        return null;
    }
}