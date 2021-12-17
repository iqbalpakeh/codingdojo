package com.visa.algo.array;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 * Ex1
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 *
 * Ex2
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 *
 * Ex3
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 *
 */
public class CheckIfExist {

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (searchLinear(arr, arr.length, arr[i] * 2, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchLinear(int[] arr, int length, int element, int invalidOffset) {
        if (arr == null || length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (i != invalidOffset && arr[i] == element) {
                return true;
            }
        }
        return false;
    }

}
