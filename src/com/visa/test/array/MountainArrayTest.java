package com.visa.test.array;

import com.visa.algo.array.MountainArray;
import com.visa.util.Util;

public class MountainArrayTest {
    {
        int[] input = new int[]{2, 1};
        Util.compare(MountainArray.validMountainArray(input), false);
    }

    {
        int[] input = new int[]{3, 5, 5};
        Util.compare(MountainArray.validMountainArray(input), false);
    }

    {
        int[] input = new int[]{0, 3, 2, 1};
        Util.compare(MountainArray.validMountainArray(input), true);
    }
}
