package com.visa.algo;

public class Permutation {

    public static boolean isPermutation(String sString, String tString) {
        if (sString.length() != tString.length()) {
            return false;
        }

        // build array
        int[] sCounter = new int[128];
        int[] tCounter = new int[128];

        char[] ss = sString.toCharArray();
        char[] tt = tString.toCharArray();

        // count each array occurrence
        for (char s : ss) {
            sCounter[s]++;
        }
        for (char t : tt) {
            tCounter[t]++;
        }

        // check array
        for (int i = 0; i < 128; i++) {
            if (sCounter[i] != tCounter[i]) {
                return false;
            }
        }

        return true;
    }

}
