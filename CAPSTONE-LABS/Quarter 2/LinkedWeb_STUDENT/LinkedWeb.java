/**
 * @author Andrew Kim, Matthew Lee
 * @since 20 November 2024
 * @version 1.0.0
 */


import java.util.ArrayList;

public interface LinkedWeb<anyType> {
    /**
     * Adds new node to web
     * @param name
     * @param neighbors
     * @param value
     * @return if successful
     */
    public boolean add(String name, ArrayList<String> neighbors, anyType value);


    /**
     * Adds neighbors to existing neighbor
     * @param name
     * @param neighbors
     * @return if successful
     */
    public boolean addNeighbors(String name, ArrayList<String> neighbors);


    /**
     * Checks if two nodes are neighbors
     * @param name1
     * @param name2
     * @return whether nodes are neighbors
     */
    public boolean areNeighbors(String name1, String name2);

    
    /**
     * Clears existing data
     */
    public void clear();


    /**
     * Checks if web contains node
     * @param name
     * @return whether web contains node
     */
    public boolean contains(String name);


    /**
     * Gets node with given name
     * @param name
     * @return
     */
    public LinkedNode<anyType> get(String name);


    /**
     * Sets new node for existing name
     * @param name
     * @param neighbors
     * @param value
     * @return
     */
    public LinkedNode<anyType> set(String name, ArrayList<String> neighbors, anyType value);


    /**
     * Shows unlinked nodes
     * @return
     */
    public String showUnlinked();


    /**
     * Finds number of nodes
     * @return number of nodes in web
     */
    public int size();
    

    /**
     * Converts nodes to array
     * @return array of nodes
     */
    public Object[] toArray();
}
