package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    // Task 3 - Returns TRUE if both brackets are the same and is nested correctly.
    //  By Brandon Filmer - G19F7591
    public static boolean Task3(String sentence){       // The method returns a boolean that accepts a string.
        int count = 0;                                  // The counter is for the ammount of brackets I have gone through.

        for(char letter : sentence.toCharArray()){      // For loop that goes through each character in the string.
            if(letter == '('){
                count++;                                // If the letter in the sentence we are checking is '(' then we add 1 to counter.
            }else if(letter == ')'){
                count--;                                // If the letter in the sentence we are checking is ')' then we minus 1 to counter.
                if(count < 0){
                    return false;                       // Once we have subtracted 1 from the counter we need to check in the nesting is correct.
                }                                       // We therefor check if there is still an open bracket and if so we return false else continue.
            }
        }
        return count == 0;                              // We check if the count is zero meaning there are an even amount of '(' to ')'.
    }

}
