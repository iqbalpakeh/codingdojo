package com.visa.test.array;

import com.visa.algo.array.Palindrome;
import com.visa.util.Util;

public class PalindromeTest {

    public static void test() {
        {
            String test = "abcdcba";
            Util.compare(true, Palindrome.isPalindrome(test));
        }
        {
            String test = "abcddcba";
            Util.compare(true, Palindrome.isPalindrome(test));
        }
        {
            String test = "abcddcbx";
            Util.compare(false, Palindrome.isPalindrome(test));
        }
    }

}
