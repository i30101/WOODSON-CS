public class Runner {
    public static Number[] buildArray() {
        Number[] nums = new Number[5];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = new Number();
        }
        return nums;
    }

    public static void printArray(Number[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }

    public static void incrementArray(Number[] arr) {
        for(Number num : arr) {
            num.increment();
        }
    }

    public static void main(String[] args) {
        Number[] arr = buildArray();
        printArray(arr);
        incrementArray(arr);
        printArray(arr);
    }
}
