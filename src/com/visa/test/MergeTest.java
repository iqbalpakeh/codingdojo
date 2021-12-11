package com.visa.test;

import com.visa.algo.Merge;
import com.visa.util.Util;

public class MergeTest {

    public static void test() {
        {
            int[] inputA = new int[]{1, 2, 3, 0, 0, 0};
            int[] inputB = new int[]{2, 5, 6};
            int[] exp = new int[]{1, 2, 2, 3, 5, 6};
            Merge.merge(inputA, 3, inputB, 3);
            Util.compare(inputA, exp);
        }
    }

}
