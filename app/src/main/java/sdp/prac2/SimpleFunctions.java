package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public SimpleFunctions() {

    }

    // Task1- By Ashleigh
    /*
     * accepts lists of integers a and b, and
     * adds up the elements from a whose indexes are specified by b. If any
     * index in b is out-of-range for a, ignore that index.
     */
    public static int Task1(int[] a, int[] b) {
        int total = 0;
        for (int index : b) {
            if (index < a.length) {
                total += a[index];
            }
        }
        return total;
    }

    // Task 2- By Ashleigh
    // removes the first character from every element in a list.
    // If an element has no characters, remove it from the output.
    public static List<String> Task2(List<String> list) {
        List<String> result = new ArrayList<String>();
        for (String str : list) {
            if (str.length() > 1) {
                result.add(str.substring(1)); // remove first character and add to result list
            }
        }
        return result;
    }

    // Task 3 - Returns TRUE if both brackets are the same and is nested correctly.
    // By Brandon Filmer - G19F7591
    public static boolean Task3(String sentence) { // The method returns a boolean that accepts a string.

        int count = 0; // The counter is for the ammount of brackets I have gone through.

        for (char letter : sentence.toCharArray()) { // For loop that goes through each character in the string.
            if (letter == '(') {
                count++; // If the letter in the sentence we are checking is '(' then we add 1 to
                         // counter.
            } else if (letter == ')') {
                count--; // If the letter in the sentence we are checking is ')' then we minus 1 to
                         // counter.
                if (count < 0) {
                    return false; // Once we have subtracted 1 from the counter we need to check in the nesting is
                                  // correct.
                } // We therefor check if there is still an open bracket and if so we return false
                  // else continue.
            }
        }

        return count == 0; // We check if the count is zero meaning there are an even amount of '(' to ')'.
    }

    //Task 4 by Cabe
    //Method that which accepts lists of integers a and b, and
    //multiplies the first element of a with the last element of b, then the
    //second element of a with the second-last element of b, and so on. The
    //resulting list is returned. If lists are different sizes, return null.

    public static List<Integer> Task4(List<Integer> a, List<Integer> b){
        List<Integer> result = new ArrayList<Integer>(); //new integer list that stores results
        
        if (a.size() != b.size()) {
            return null; //returns null is list sizes do not match
        }
        
        else{
            for (int i = 0; i < a.size(); i++){
                result.add(a.get(i) * b.get((b.size() - 1) - i)); //Multiplies list values from each list accordingly
            }
            return result; //returns resultant list
        }
    }
}
