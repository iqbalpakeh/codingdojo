package com.visa.test;

import com.visa.algo.SortedSquare;
import com.visa.util.Util;

public class SortedSquareTest {

    public static void test() {
        {
            int[] data = new int[]{-7, -3, 2, 3, 11};
            int[] exp = new int[]{4, 9, 9, 49, 121};
            Util.compare(SortedSquare.sortedSquares(data), exp);
        }
    }

}
