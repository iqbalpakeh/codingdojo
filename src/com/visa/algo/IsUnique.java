package com.visa.algo;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    // O(n)
    public static boolean isUnique(String input) {
        Map<Character, Character> map = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                return false;
            }
            map.put(c, c);
        }
        return true;
    }

}
