package com.demo.interview.stringproblem;

import java.util.HashMap;
import java.util.Map;

public class AnagramProblem {

    public static boolean compareAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i =0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (charCountMap.containsKey(ch)) {
                Integer count  = charCountMap.get(ch);
                count++;
                charCountMap.put(ch, count);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        for (int j =0; j<s.length(); j++) {
            char ch = t.charAt(j);
            if (charCountMap.containsKey(ch)) {
                Integer count  = charCountMap.get(ch);
                count--;
                charCountMap.put(ch, count);
                if (count == 0) {
                    charCountMap.remove(ch);
                }
            } else {
                return false;
            }
        }
        if (!charCountMap.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(compareAnagram("anagram", "nagaram"));
        System.out.println(compareAnagram("anagram", "nagaraa"));
        System.out.println(compareAnagram("anagram", "nagara"));
        System.out.println(compareAnagram("cat", "car"));
    }

}
