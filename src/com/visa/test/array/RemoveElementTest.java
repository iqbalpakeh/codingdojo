package com.visa.test.array;

import com.visa.algo.array.RemoveElement;

public class RemoveElementTest {

    public static void test() {
        {
            boolean isError = false;
            int[] input = new int[]{4, 5};
            int k = RemoveElement.removeElement(input, 5);
            if (k != 1) {
                isError = true;
            }
            int[] exp = new int[]{4};
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
        {
            boolean isError = false;
            int[] input = new int[]{1};
            int k = RemoveElement.removeElement(input, 1);
            if (k != 0) {
                isError = true;
            }
            if (isError) {
                System.out.println("ERROR");
            } else {
                System.out.println("PASS");
            }
        }
        {
            boolean isError = false;
            int[] input = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
            int k = RemoveElement.removeElement(input, 2);
            if (k != 5) {
                isError = true;
            }
            int[] exp = new int[]{0, 1, 3, 0, 4};
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
        {
            boolean isError = false;
            int[] input = new int[]{3, 2, 2, 3};
            int k = RemoveElement.removeElement(input, 3);
            if (k != 2) {
                isError = true;
            }
            int[] exp = new int[]{2, 2};
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
