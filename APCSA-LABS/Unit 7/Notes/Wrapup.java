import java.util.*;

public class Wrapup {
    static void swap(ArrayList<Integer> ints, int pos1, int pos2) {
        ints.set(pos2, ints.set(pos1, ints.get(pos2)));
    }

    static void insertSort(ArrayList<Integer> ints) {
        for(int i = 1; i < ints.size(); i++) {
            int n = i;
            while(n > 0 && ints.get(n) > ints.get(n - 1)) {
                swap(ints, n -1, n);
                n--;
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++) {
            ints.add((int) (Math.random() * 36) + 15);
        }
        System.out.println(ints);
        insertSort(ints);
        System.out.println(ints);
    }
}
