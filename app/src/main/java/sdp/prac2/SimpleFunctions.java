package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
        // Task1
    }

    public static int Task1(int[] a, int[] b) {
        int total = 0;
        for (int index : b) {
            if (index < a.length) {
                total += a[index];
            }
        }
        return total;
    }
}
