import java.util.*;

public class SwapTester {
    public static void swap(ArrayList<Double> list, int pos1, int pos2) {
        list.set(pos2, list.set(pos1, list.get(pos2)));
    }

    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();
        for(Double i = 0.0; i < 5; i += 0.4) {
            nums.add(i);
        }
        System.out.println(nums);
        swap(nums, 2, 5);
        System.out.println(nums);
        nums.add(9.23);
        System.out.println(nums);
        swap(nums, 4, 1);
        System.out.println(nums);
    }
}
