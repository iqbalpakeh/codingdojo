package com.visa.test.array;

import com.visa.algo.array.CheckIfExist;
import com.visa.util.Util;

public class CheckIfExistTest {

    public static void test() {
        {
            int[] input = new int[]{10, 2, 5, 3};
            Util.compare(CheckIfExist.checkIfExist(input), true);
        }
        {
            int[] input = new int[]{7, 1, 14, 11};
            Util.compare(CheckIfExist.checkIfExist(input), true);
        }
        {
            int[] input = new int[]{3, 1, 7, 11};
            Util.compare(CheckIfExist.checkIfExist(input), false);
        }
        {
            int[] input = new int[]{-2, 0, 10, -19, 4, 6, -8};
            Util.compare(CheckIfExist.checkIfExist(input), false);
        }
    }

}
