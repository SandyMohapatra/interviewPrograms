package com.demo.interview.stringproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedHtmlString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "<div>abc</div><p><em><i>test test test</b></em></p>";
        System.out.println(stringChallenge(str));
    }

    public static String stringChallenge(String str) {
        // code goes here
        Map<Character, String> elements = new HashMap<>();
        elements.put('{',"<div>");
        elements.put('}',"</div>");
        elements.put('(',"<b>");
        elements.put(')',"</b>");
        elements.put('[',"<p>");
        elements.put(']',"</p>");
        elements.put('<',"<i>");
        elements.put('>',"</i>");
        elements.put('+',"<em>");
        elements.put('-',"</em>");

        Map<Character, Character> symMap = new HashMap<>();
        symMap.put('{','}');
        symMap.put('[',']');
        symMap.put('(',')');
        symMap.put('<','>');
        symMap.put('+','-');

        String encodedStr = str;
        for (Character element: elements.keySet()) {
            encodedStr = encodedStr.replaceAll(elements.get(element), element.toString());
        }

        Stack<Character> stack = new Stack<>();
        int idx =0;
        Character res = null;
        while (idx < encodedStr.length()) {
            char ch = encodedStr.charAt(idx);
            if (symMap.containsKey(ch)) {
                stack.add(ch);
            } else if (symMap.containsValue(ch)) {
                if (stack.isEmpty()) {
                    res = ch;
                }
                char lastChar = stack.pop();
                if (symMap.get(lastChar) != ch) {
                    res = lastChar;
                }
            }
            idx++;
        }
        if (res != null) {
            String result = elements.get(res);
            return result.substring(1, result.length()-1);
        }
        return "true";
    }

}
