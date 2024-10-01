public class maxIndex {
    public static int getMaxIndex(int[] arr) {
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[index]) {
                arr[index] = arr[i];
                index = i;
            }
        }
        return index;
    }
}