package com.demo.interview.stringproblem;

public class LongestCommonPrefix {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();
        for(int i =0;i<strs[0].length();i++) {
            int currStrIdx = 1;
            boolean isFound = true;
            boolean isWordEnded = false;
            char ch = strs[0].charAt(i);
            while (currStrIdx < strs.length) {
                if (strs[currStrIdx].length()-1 < i) {
                    isWordEnded =true;
                }
                else if (strs[currStrIdx].charAt(i) != ch) {
                    isFound = false;
                    break;
                }
                currStrIdx++;
            }
            if (isFound && !isWordEnded) {
                res.append(ch);
            } else {
                break;
            }
        }
        return res.toString();
    }

}
