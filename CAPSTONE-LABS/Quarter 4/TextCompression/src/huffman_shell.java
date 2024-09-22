/**
 * @author Andrew Kim and Matthew Lee
 * @since 24 April 2025
 * @version 1.0.0
 */


import java.sql.SQLOutput;
import java.util.*;
import java.io.*;


/**
 * A program to implement Huffman style compression to encode/compress text into binary
 */
public class huffman_shell {
    private static final String PLACEHOLDER = "*";

    // data field to read input from the client at the keyboard
    public static Scanner keyboard = new Scanner(System.in);


    /**
     * A main function to run
     *
     * @param args 'cause, you know, we need this
     * @throws IOException in case we can't find a file we are looking for
     */
    public static void main(String[] args) throws IOException {
        // prompt for two strings
        System.out.println("Encoding using Huffman codes");
        System.out.println("Enter a message to compress in code ");
        String message = keyboard.nextLine();

        System.out.println("Enter middle part of filename: ");
        String middlePart = keyboard.nextLine();

        huffmanize(message, middlePart);
    }


    public static void huffmanize(String message, String middlePart) throws IOException {
        // TODO make a frequency table of the letters
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Integer> frequencies = new ArrayList<>();

        int index;
        for (char c : message.toCharArray()) {
            index = letters.indexOf(c);
            if (index != -1) {
                // letter is already in letters
                frequencies.set(index, frequencies.get(index) + 1);
            } else {
                // letter is not in letters
                // add letter and frequency of 1
                letters.add(c);
                frequencies.add(1);

            }
        }

        // TODO put each letter-frequency pair into a HuffmanTreeNode. Put each node into a priority queue (or a min-heap).
        PriorityQueue<HuffmanTreeNode> queue = new PriorityQueue<>();
        for (int i = 0; i < letters.size(); i++) {
            queue.add(new HuffmanTreeNode(
                    letters.get(i),
                    frequencies.get(i)
            ));
        }


        // TODO use the priority queue of nodes to build the Huffman tree
        while (queue.size() > 1) {
            System.out.println("\n\nPrinting values");
            for (HuffmanTreeNode node : queue) {
                System.out.print(node + "  ");
            }
            HuffmanTreeNode first = queue.remove();
            HuffmanTreeNode second = queue.remove();

            System.out.println("\nPrinting again");
            System.out.print(first + "  ");
            System.out.print(second + "  ");
            for (HuffmanTreeNode node : queue) {
                System.out.print(node + "  ");
            }

            queue.add(new HuffmanTreeNode(
                    PLACEHOLDER,
                    first.getFrequency() + second.getFrequency(),
                    first,
                    second
            ));
        }

        HuffmanTreeNode root = queue.remove();

        // TODO Process the string letter-by-letter and search the tree for the letter. It's recursive. As you recur, build the path through the tree, left is 0 and right is 1.
        // TODO System.out.println the binary message
        String binary;
        StringBuilder binaryMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            binary = getPath(root, message.substring(i, i + 1));
            System.out.print(binary);
            binaryMessage.append(binary);
        }

        // TODO Write the binary message to the hard drive using the file name ("message." + middlePart + ".txt")
        write("data/message." + middlePart + ".txt", binaryMessage.toString());

        // TODO System.out.println the scheme from the tree--needs a recursive helper method
        String scheme = getNodes(root, root);
        System.out.println(scheme);

        // TODO Write the scheme to the hard drive using the file name ("scheme." + middlePart + ".txt")
        write("data/scheme." + middlePart + ".txt", scheme);
    }


    /**
     * Searches through binary tree
     * Not sure if the most optimal?
     * @param root starting node
     * @param target looking for this
     * @return 0 or 1 if hit, null if not
     */
    private static String getPath(HuffmanTreeNode root, String target) {
        if (root == null) {
            return null;
        } else {
            if (root.getValue().toString().equals(target)) {
                return "";
            } else if (getPath(root.getLeft(), target) != null) {
                return "0" + getPath(root.getLeft(), target);
            } else if (getPath(root.getRight(), target) != null) {
                return "1" + getPath(root.getRight(), target);
            } else {
                return null;
            }
        }
    }


    /**
     * Gets roots in tree
     * Not sure if this is the best either...
     * @param r starting node
     * @return encoding scheme summary
     */
    private static String getNodes(HuffmanTreeNode r, HuffmanTreeNode root) {
        if (r == null) {
            return "";
        } else {
            String children = getNodes(r.getLeft(), root) + getNodes(r.getRight(), root);
            if (!r.getValue().toString().equals(PLACEHOLDER)) {
                System.out.println(r.getValue());
                System.out.println(getPath(r, r.getValue().toString()));
                return r.getValue().toString() + getPath(root, r.getValue().toString()) + "\n" + children;
            } else {
                return children;
            }
        }
    }


    private static void write(String path, String message) {
        // make file first
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already created");
            }
        } catch (IOException e) {
            System.out.println("Error creating file");
        }

        // write file next
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(message);
            writer.close();
            System.out.println("Successfully wrote file");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }


}





/**
 * This tree node stores two values: a letter and its frequency, as well as pointers to their left and right subtrees
 * The compareTo method must ensure that the lowest frequency has the highest priority.
 */
class HuffmanTreeNode implements Comparable<HuffmanTreeNode> {
    private Object value;
    private int frequency;
    private HuffmanTreeNode left;
    private HuffmanTreeNode right;


    /**
     * HuffmanTreeNode constructor without pointers
     * @param value letter
     * @param frequency how many times letter occurs
     */
    public HuffmanTreeNode(Object value, int frequency) {
        this.value = value;
        this.frequency = frequency;
        this.right = null;
        this.left = null;
    }


    /**
     * HuffmanTreeNode with pointers
     * @param value letter
     * @param frequency how many times letter occurs
     * @param right right node
     * @param left left node
     */
    public HuffmanTreeNode(Object value, int frequency, HuffmanTreeNode left, HuffmanTreeNode right) {
        this.frequency = frequency;
        this.value = value;
        this.left = left;
        this.right = right;
    }


    /**
     * Compare Huffman Tree Nodes by their frequencies
     * @param o the object to be compared.
     * @return a negative number if that has a higher freq than this; a positive number if number as a higher freq than that, 0 if the freq are th same
     */
    public int compareTo(HuffmanTreeNode o) {
        // TODO write method
        return this.frequency - o.frequency;
    }


    public Object getValue() {
        return value;
    }


    public int getFrequency() {
        return frequency;
    }


    public HuffmanTreeNode getRight() {
        return right;
    }


    public HuffmanTreeNode getLeft() {
        return left;
    }


    public void setRight(HuffmanTreeNode right) {
        this.right = right;
    }


    public void setLeft(HuffmanTreeNode left) {
        this.left = left;
    }


    @Override
    public String toString() {
        return value + "" + frequency;
    }
}
