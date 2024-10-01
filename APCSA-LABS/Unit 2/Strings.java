import java.util.*;

public class Strings {
    static Scanner input = new Scanner(System.in);

    static String removex(String orig) {
        String output = orig.substring(0, 1);
        for(int i = 1; i < orig.length() - 1; i++) {
            if(!orig.substring(i, i + 1).equals("x")) {
                output += orig.substring(i, i + 1);
            }
        }
        return output + orig.substring(orig.length() - 1);
    }

    static void oddSum() {
        System.out.print("Number of odd numbers you want: ");
        int nums = input.nextInt(), sum = 0;
        String out = "";
        for(int i = 1; i < nums * 2; i += 2) {
            out += i + ", ";
            sum += i;
        }
        System.out.println("The first " + nums + " odd numbers are " + out.substring(0, out.length() - 2));
        System.out.println("The sum of the " + nums + " odd numbers is " + sum);
    }
    
    static void endAppend() {
        System.out.print("Enter your string: ");
        String original = input.next(), reduced = "";
        for(int i = 0; i < original.length(); i += 2) {
            reduced += original.substring(i, i + 1);
        }
        System.out.println("Your reduced string: " + reduced);
        String first = "dog", second = "go", append = first;
        if(first.substring(first.length() - 1).equals(second.substring(0, 1))) {
            append += second.substring(1);
        }else {
            append += second;
        }
        System.out.println(append);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        removex("xasdfadasdxxxasdfasxdxfSDFADSF");
        oddSum();
        endAppend();

        input.close();
    }
}
