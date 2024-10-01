/*Andrew Kim    30 November 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Customer {
    final static String[] names = {"Priam", "Hector", "Paris", "Troilus", "Hecuba", "Andromache"};
    final static String[] entrees = {"Ribs", "Tuna Casserole", "Lasagna", "Meatballs and Spaghetti", "Ambrosia"};
    final static String[] drinks = {"Water", "Orange Juice", "Apple Juice", "Coke", "Nectar"};

    private String[] attributes;

    public Customer() {
        attributes = new String[3];
        attributes[0] = genAttribute(names);
        attributes[1] = genAttribute(entrees);
        attributes[2] = genAttribute(drinks);
    }

    private String genAttribute(String[] a) {
        return a[(int) (Math.random() * a.length)];
    }

    @Override
    public String toString() {
        return attributes[0] + " has " + attributes[1] + " and " + attributes[2];
    }
}