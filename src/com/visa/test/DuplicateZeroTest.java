package com.visa.test;

import com.visa.algo.DuplicateZero;
import com.visa.util.Util;

public class DuplicateZeroTest {

    public static void test() {
        {
            int[] input = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
            int[] exp = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
            DuplicateZero.duplicateZeros(input);
            Util.compare(input, exp);
        }
        {
            int[] input = new int[]{1, 2, 3};
            int[] exp = new int[]{1, 2, 3};
            DuplicateZero.duplicateZeros(input);
            Util.compare(input, exp);
        }
        {
            int[] input = new int[]{0, 1, 7, 6, 0, 2, 0, 7};
            int[] exp = new int[]{0, 0, 1, 7, 6, 0, 0, 2};
            DuplicateZero.duplicateZeros(input);
            Util.compare(input, exp);
        }
    }

}
