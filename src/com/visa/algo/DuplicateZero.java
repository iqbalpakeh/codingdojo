package com.visa.algo;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return anything.
 *
 * Example 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * Example 2:
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 */

public class DuplicateZero {

    public static void duplicateZeros(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == 0) {
                insert(arr, 0, i + 1);
            }
        }
    }

    private static void insert(int[] arr, int val, int offset) {
        for (int i = arr.length - 2; i >= offset; i--) {
            arr[i + 1] = arr[i];
        }
        arr[offset] = val;
     }

}
