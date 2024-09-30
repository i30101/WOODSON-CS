import java.util.*;


public class newWarmup {
    public static int search(String[] arr, String str) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == str) {
                return i;
            }
        }
        return -1;
    }

    public static int search(ArrayList<String> myList, int num) {
        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i).length() == num) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int middle = (left + right) / 2;
            if(array[middle] == target) {
                return middle;
            }else if(array[middle] > target) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] l1 = {0, 1, 2, 3, 5, 6, 7, 8, 13, 14, 16, 17, 19, 23, 24, 25, 29, 30, 34, 40};
    }
}
