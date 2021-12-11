package com.visa.util;

public class Util {

    public static void compare(boolean act, boolean exp) {
        if (act != exp) {
            System.out.println("ERROR: act = " + act + ", exp = " + exp);
        } else {
            System.out.println("PASS");
        }
    }

    public static void compare(int act, int exp) {
        if (act != exp) {
            System.out.println("ERROR: act = " + act + ", exp = " + exp);
        } else {
            System.out.println("PASS");
        }
    }

    public static void compare(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("ERROR");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                System.out.println("ERROR");
            }
        }
        System.out.println("PASS");
    }

}
