package com.visa.test.array;

import com.visa.algo.array.RemoveDuplicateFromSortedArray;
import com.visa.util.Util;

public class RemoveDuplicateFromSortedArrayTest {

    public static void test() {
        {
            int[] input = new int[]{1, 1, 2};
            int[] exp = new int[]{1, 2};
            int k = RemoveDuplicateFromSortedArray.removeDuplicates(input);
            Util.compare(k, 2);
            boolean isError = false;
            for (int i = 0; i < k; i++) {
                if (input[i] != exp[i]) {
                    isError = true;
                    break;
                }
            }
            if (isError) {
                System.out.println("FAIL");
            } else {
                System.out.println("PASS");
            }
        }
        {
            int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            int[] exp = new int[]{0, 1, 2, 3, 4};
            int k = RemoveDuplicateFromSortedArray.removeDuplicates(input);
            Util.compare(k, 5);
            boolean isError = false;
            for (int i = 0; i < k; i++) {
                if (input[i] != exp[i]) {
                    isError = true;
                    break;
                }
            }
            if (isError) {
                System.out.println("FAIL");
            } else {
                System.out.println("PASS");
            }
        }
    }

}
