package com.visa.test.array;

import com.visa.algo.array.RemoveElement;

public class RemoveElementTest {

    public static void test() {
        {
            boolean isError = false;
            int[] input = new int[]{3, 2, 2, 3};
            int k = RemoveElement.removeElement(input, 3);
            if (k != 2) {
                isError = true;
            }
            int[] exp = new int[] {2, 2};
            for (int i = 0; i < k - 1; i++) {
                if (input[i] != exp[i]) {
                    isError = true;
                }
            }
            if (isError) {
                System.out.println("ERROR");
            } else {
                System.out.println("PASS");
            }
        }
    }

}
