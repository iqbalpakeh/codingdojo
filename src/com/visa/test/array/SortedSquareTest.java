package com.visa.test.array;

import com.visa.algo.array.SortedSquare;
import com.visa.util.Util;

public class SortedSquareTest {

    public static void test() {
        {
            int[] data = new int[]{-4,-1,0,3,10};
            int[] exp = new int[]{0,1,9,16,100};
            Util.compare(SortedSquare.sortedSquares(data), exp);
        }
        {
            int[] data = new int[]{-7, -3, 2, 3, 11};
            int[] exp = new int[]{4, 9, 9, 49, 121};
            Util.compare(SortedSquare.sortedSquares(data), exp);
        }
    }

}
