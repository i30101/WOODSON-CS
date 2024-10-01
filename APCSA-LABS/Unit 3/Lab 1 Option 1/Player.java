/*Andrew Kim    27 October 2022
On my honor as a student I have given nor received any authorized assistance on this assignment. */

public class Player {
    private int tree, bucket;
    private String name;

    public Player(String playerName) {
        name = playerName;
        tree = 10;
        bucket = 0;
    }

    public boolean hasWon() {
        if(bucket == 10) {
            return true;
        }
        return false;
    }

    public void updateCherries(int bucketNew) {
        bucket += bucketNew;
        tree -= bucketNew;
        if(bucket <= 0) {
            bucket = 0;
            tree = 10;
        }else if(bucket >= 10) {
            bucket = 10;
            tree = 0;
        }
    }

    public int getTreeCherries() {
        return tree;
    }

    public int getBucketCherries() {
        return bucket;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tree cherries: " + tree + "\nBucket cherries: " + bucket + "\n";
    }
}
