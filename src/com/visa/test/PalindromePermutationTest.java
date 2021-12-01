package com.visa.test;

import com.visa.algo.PalindromePermutation;
import com.visa.util.Util;

public class PalindromePermutationTest {

    public static void test() {
        {
            String test = "Tact Coa";
            Util.compare(true, PalindromePermutation.isPalindromePermutation(test));
        }
    }

}
