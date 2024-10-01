/*Andrew Kim    15 September 2022
On my honor as a student I have given nor reeived any authorized assistance on this assignment. */

import java.util.*;

public class Option1 {
    static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? true : false;
    }

    static void printClosest(int notLeap, int isLeap) {
        System.out.println(notLeap + " is not a leap year. The closest leap year is " + isLeap + ".");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(isLeap(year)) {      // the year is a leap year
            System.out.println(year + " is a leap year.");
        }else if(!isLeap(year) && year % 100 == 0) {        // the year is not a leap year and a multiple of 100 (e.g. 1900)
            printClosest(year, year + ((Math.random() < 0.5) ? -4 : 4));
        }else {
            if(year % 4 == 1) {            // the year is 1 more than a leap year
                if(isLeap(year - 1)) {
                    printClosest(year, year - 1);
                }else if(isLeap(year + 3)) {
                    printClosest(year, year + 3);
                }else {
                    printClosest(year, year - 5);
                }
            }else if(year % 4 == 3) {            // the year is 3 more than a leap year (e.g. 2003)
                if(isLeap(year + 1)) printClosest(year, year + 1);
                else if(isLeap(year - 3)) printClosest(year, year -3);
                else printClosest(year, year + 5);
            }else {            // the year is 2 more than a leap year
                printClosest(year, ((Math.random() < 0.5) ? -2 : 2));
            }
        }
        input.close();
    }
}
