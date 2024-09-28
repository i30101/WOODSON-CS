/*Andrew Kim    12 March 2023
On my honor as a student I have given nor received any authorized assistance on this assignment. */

import java.util.*;

public class PalindromeTester {
    private static ArrayList<String> words;
    private static ArrayList<String> palindromes;
    private static Scanner input = new Scanner(System.in);

    public static void getWord() {
        System.out.print("Enter an input, or -1 to exit: ");
        String answer = input.next().toLowerCase();
        if(answer.equals("-1")) {
            return;
        }else {
            words.add(answer);
            if(isPalindrome(answer)) {
                palindromes.add(answer);
            }
            getWord();
        }
    }

    public static boolean isPalindrome(String s) {
        if(s.length() < 2) {
            return true;
        }else if(s.substring(0, 1).equals(s.substring(s.length() - 1))) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        words = new ArrayList<String>();
        palindromes = new ArrayList<String>();
        getWord();
        if(words.size() > 0) {
            System.out.println(
                "All inputs: " + words + 
                "\n\nPalindromes: " + palindromes
            );
        }
    }
}