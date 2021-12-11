package com.visa.test.array;

import com.visa.algo.array.MaxConsecutiveOnes;
import com.visa.util.Util;

public class MaxConsecutiveOnesTest {

    public static void test() {
        {
            int[] arr = {1, 1, 0, 1, 1, 1};
            Util.compare(3, MaxConsecutiveOnes.findMaxConsecutiveOnes(arr));
        }
        {
            int[] arr = {1, 0, 1, 1, 0, 1};
            Util.compare(2, MaxConsecutiveOnes.findMaxConsecutiveOnes(arr));
        }
    }

}
