package com.visa.algo.array;

public class Palindrome {

    public static boolean isPalindrome(String phrase) {
        char[] chars = phrase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
