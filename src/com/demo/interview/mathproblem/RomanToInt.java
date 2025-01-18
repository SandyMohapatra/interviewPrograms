package com.demo.interview.mathproblem;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
        Map<Character,Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);
        
        int res = 0;
        for (int i=0; i < s.length(); i++) {
        	char currChar = s.charAt(i);
        	char nextChar = '?';
        	if (i != s.length()-1) {
        		nextChar = s.charAt(i+1);
        	}
        	
        	if (currChar == 'I' && nextChar == 'V') {
        		res += 4;
        		i++;
        	} else if (currChar == 'I' && nextChar == 'X') {
        		res += 9;
        		i++;
        	} else if (currChar == 'I' && nextChar == 'X') {
        		res += 9;
        		i++;
        	} else if (currChar == 'X' && nextChar == 'L') {
        		res += 40;
        		i++;
        	} else if (currChar == 'X' && nextChar == 'C') {
        		res += 90;
        		i++;
        	} else if (currChar == 'C' && nextChar == 'D') {
        		res += 400;
        		i++;
        	} else if (currChar == 'C' && nextChar == 'M') {
        		res += 900;
        		i++;
        	} else {
        		res += romanIntMap.get(currChar);
        	}
        }
        return res;
    }

}
