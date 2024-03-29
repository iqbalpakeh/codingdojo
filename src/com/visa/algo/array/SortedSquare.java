package com.visa.algo.array;

public class SortedSquare {


    public static int[] sortedSquares(int[] nums) {

        // find the switching point
        // if not, then just do square, no need ordering
        // if found, split into two array
        // once split, the reverse the negative array
        // then, merge the array

        int offset = findFirstPositiveOrZero(nums);

        if (offset < 0) {
            return squareArray(reverseArray(nums));
        }

        if (offset == 0) {
            return squareArray(nums);
        }

        int[] arrLow = new int[offset];
        int[] arrHigh = new int[nums.length - offset];

        arrLow = copyArray(nums, arrLow, 0, offset);
        arrLow = squareArray(arrLow);
        arrLow = reverseArray(arrLow);

        arrHigh = copyArray(nums, arrHigh, offset, nums.length - offset);
        arrHigh = squareArray(arrHigh);

        return mergeArray(arrLow, arrHigh);
    }

    private static int findFirstPositiveOrZero(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                return pos;
            }
            pos++;
        }
        if (pos > nums.length - 1) {
            return -1;
        }
        return pos;
    }

    private static int[] mergeArray(int[] arrA, int[] arrB) {
        int newLength = arrA.length + arrB.length;
        int[] arrNew = new int[newLength];
        int ia = 0;
        int ib = 0;
        for (int i = 0; i < newLength; i++) {
            if (ia == arrA.length) {
                arrNew[i] = arrB[ib++];
                continue;
            }
            if (ib == arrB.length) {
                arrNew[i] = arrA[ia++];
                continue;
            }
            if (arrA[ia] < arrB[ib]) {
                arrNew[i] = arrA[ia++];
            } else {
                arrNew[i] = arrB[ib++];
            }
        }
        return arrNew;
    }

    private static int[] reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static int[] copyArray(int[] src, int[] dst, int start, int length) {
        for (int i = start; i < start + length; i++) {
            dst[i - start] = src[i];
        }
        return dst;
    }

    private static int[] squareArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }

}
