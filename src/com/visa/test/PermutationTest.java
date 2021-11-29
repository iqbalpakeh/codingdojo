package com.visa.test;

import com.visa.algo.Permutation;
import com.visa.util.Util;

public class PermutationTest {

    public static void test() {
        {
            String temp1 = "sun";
            String temp2 = "nus";
            Util.compare(true, Permutation.isPermutation(temp1, temp2));
        }
        {
            String temp1 = "sun";
            String temp2 = "nua";
            Util.compare(false, Permutation.isPermutation(temp1, temp2));
        }
        {
            String temp1 = "abcdef";
            String temp2 = "fedcba";
            Util.compare(true, Permutation.isPermutation(temp1, temp2));
        }
    }

}
