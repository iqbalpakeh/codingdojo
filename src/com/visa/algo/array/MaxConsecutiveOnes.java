package com.visa.algo.array;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int counterOnes = 0;
        // normal case
        for (int num : nums) {
            if (num == 1) {
                counterOnes++;
            } else {
                if (maxConsecutiveOnes < counterOnes) {
                    maxConsecutiveOnes = counterOnes;
                }
                counterOnes = 0;
            }
        }
        // check last index
        if (nums[nums.length - 1] == 1) {
            if (maxConsecutiveOnes < counterOnes) {
                maxConsecutiveOnes = counterOnes;
            }
        }
        return maxConsecutiveOnes;
    }

}
