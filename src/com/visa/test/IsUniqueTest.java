package com.visa.test;

import com.visa.algo.IsUnique;
import com.visa.util.Util;

public class IsUniqueTest {

    public static void test() {
        {
            String test = "abcdef";
            Util.compare(true, IsUnique.isUnique(test));
        }
        {
            String test = "abcdefd";
            Util.compare(false, IsUnique.isUnique(test));
        }
    }

}
