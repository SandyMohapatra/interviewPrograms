package com.demo.interview.stringproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBracket {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String patterns = "{{(([]))}[]}";
        //
        System.out.println(findBalance(patterns));
        System.out.println(findBalance("{{(([]))}}"));
        System.out.println(findBalance("{{(([]))}"));
    }

    public static boolean findBalance(String patterns) {
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('{', '}');
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        Stack<Character> stack = new Stack<>();

        int idx=0;
        while (idx < patterns.length()) {
            char curr = patterns.charAt(idx);
            if (bracketMap.containsKey(curr)) {
                stack.add(curr);
            } else {
                char ch = stack.pop();
                if (bracketMap.get(ch) != curr) {
                    return false;
                }
            }
            idx++;
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

}
