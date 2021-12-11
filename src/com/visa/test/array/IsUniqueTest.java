package com.visa.test.array;

import com.visa.algo.array.IsUnique;
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
