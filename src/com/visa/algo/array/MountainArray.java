package com.visa.algo.array;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Ex1
 * Input: arr = [2,1]
 * Output: false
 *
 * Ex2
 * Input: arr = [3,5,5]
 * Output: false
 *
 * Ex3
 * Input: arr = [0,3,2,1]
 * Output: true
 *
 */

public class MountainArray {

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int inc = -1;
        int dec = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && dec == -1) {
                inc = 1;
            } else if (arr[i] < arr[i -1] && inc == 1) {
                dec = 1;
            } else {
                return false;
            }
        }
        return dec == 1;
    }

}
