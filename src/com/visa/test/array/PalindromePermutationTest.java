package com.visa.test.array;

import com.visa.algo.array.PalindromePermutation;
import com.visa.util.Util;

public class PalindromePermutationTest {

    public static void test() {
        {
            String test = "Tact Coa";
            Util.compare(true, PalindromePermutation.isPalindromePermutation(test));
        }
    }

}
