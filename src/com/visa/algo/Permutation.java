package com.visa.algo;

public class Permutation {

    public static boolean isPermutation(String ss, String tt) {
        if (ss.length() != tt.length()) {
            return false;
        }

        int[] counter = new int[128];

        for (char s: ss.toCharArray()) {
            counter[s]++;
        }

        for (char t: tt.toCharArray()) {
            counter[t]--;
            if (counter[t] < 0) {
                return false;
            }
        }

        return true;
    }

}
