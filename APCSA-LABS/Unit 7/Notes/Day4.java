import java.util.*;;

public class Day4 {
    public static void swap(ArrayList<String> words, int x, int y) {
        words.set(y, words.set(x, words.get(y)));
    }

    public static void selectionSort(ArrayList<Comparable> elements) {
        for(int i = 0; i < elements.size() - 1; i++) {
            int min = i;
            for(int j = i + 1; j < elements.size(); j++) {
                if(elements.get(min).compareTo(elements.get(j)) > 0) {
                    swap(elements, min, j);
                }
            }
        }
    }

    public static void setZero(ArrayList<Integer> integers) {
        for(int i = 0; i < integers.size(); i++) {
            if(integers.get(i) < 0) {
                integers.set(i, 0);
            }
        }
    }

    public static void removeNegative(ArrayList<Integer> integers) {
        for(int i = 0; i < integers.size(); i++) {
            if(integers.get(i) < 0) {
                integers.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        // ArrayList<String> words = new ArrayList<String>();
        // words.add("Joy");
        // words.add("To The");
        // words.add("World");
        // System.out.println(words);
        // swap(words, 0, 2);
        // System.out.println(words);

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(-3);
        integers.add(12);
        integers.add(-6);
        integers.add(-5);
        System.out.println(integers);
        setZero(integers);
        System.out.println(integers);
    }
}
