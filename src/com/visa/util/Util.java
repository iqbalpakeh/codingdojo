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

}
