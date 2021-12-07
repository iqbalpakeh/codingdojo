package com.visa.algo;

public class SortedSquare {

    public int[] sortedSquares(int[] nums) {

        // find 0
        // if not, then just do square, no need ordering
        // if found, split in to two array
        // once split, the reverse the negative array
        // then, merge the array

        int zeroOffset = findZero(nums);
        if (zeroOffset > 0) {
            return squareArray(nums);
        }

        int[] arrLow = new int[zeroOffset];
        int[] arrHigh = new int[nums.length - zeroOffset];

        arrLow = copyArray(nums, arrLow, 0, zeroOffset - 1);
        arrLow = squareArray(arrLow);
        arrLow = reverseArray(arrLow);

        arrHigh = copyArray(nums, arrHigh, zeroOffset, nums.length - 1 - zeroOffset);
        arrHigh = squareArray(arrHigh);

        return mergeArray(arrLow, arrHigh);
    }

    private int[] mergeArray(int[] arrA, int[] arrB) {
        // ...
        return null;
    }

    private int[] reverseArray(int[] arr) {
        int temp;
        for (int i=0; i<arr.length; i++) {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private int[] copyArray(int[] src, int[] dst, int start, int length) {
        for (int i=start; i<start+length; i++) {
            dst[i] = src[i];
        }
        return dst;
    }

    private int[] squareArray(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }

    private int findZero(int[] nums) {
        int pos = 0;
        for (int num: nums) {
            if (num == 0) {
                return pos;
            }
            pos++;
        }
        return -1;
    }

}
