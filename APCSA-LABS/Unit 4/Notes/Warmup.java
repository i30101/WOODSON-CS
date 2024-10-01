public class Warmup {
    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int rand(int max) {
        return (int) (Math.random() * (max + 1) + 1);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            int[] temp = new int[rand(5)];
            for(int n = 0; n < temp.length; n++) {
                temp[n] = rand(100);
            }
            for(int num : temp) {
                System.out.print(num + " ");
            }
            System.out.println("\nMin: " + getMin(temp));
            System.out.println("Max: " + getMax(temp) + "\n");
        }
    }
}