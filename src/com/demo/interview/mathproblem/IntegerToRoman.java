package com.demo.interview.mathproblem;

import java.util.Arrays;
import java.util.List;

public class IntegerToRoman {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(intToRoman(27));
        System.out.println(intToRoman(4));
        //System.out.println(intToRoman(91));
        //System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        List<Integer> denoList = Arrays.asList(1,5,10,50,100,500,1000);
        List<Character> romanList = Arrays.asList('I', 'V', 'X', 'L', 'C', 'D', 'M');
        StringBuilder result = new StringBuilder();
        int idx =0;
        while (idx < denoList.size()-1) {
            if (num > 0 && num < denoList.get(idx)) {
                idx--;
                break;
            }
            idx++;
        }
        int n = num;
        while (idx >= 0) {
            if (idx > 0 && n >= (denoList.get(idx) - denoList.get(idx-1))
                    && n < denoList.get(idx)){
                result.append(romanList.get(idx-1)).append(romanList.get(idx));
                n = Integer.parseInt(Integer.toString(n).substring(1));
                int j =0;
                while (j < denoList.size()-1) {
                    if (n > 0 && n < denoList.get(j)) {
                        break;
                    }
                    j++;
                }
                idx=--j;
            } else if (idx > 0 && idx <6 && n >= (denoList.get(idx+1) - denoList.get(idx-1))
                    && n < denoList.get(idx+1)){
                result.append(romanList.get(idx-1)).append(romanList.get(idx+1));
                n = Integer.parseInt(Integer.toString(n).substring(1));
                int j =0;
                while (j < denoList.size()-1) {
                    if (n > 0 && n < denoList.get(j)) {
                        break;
                    }
                    j++;
                }
                idx=--j;
            } else {
                int q = n / denoList.get(idx);
                for (int j = 0; j<q;j++) {
                    result.append(romanList.get(idx));
                }
                n = n - (denoList.get(idx)*q);
                idx--;
            }
        }
        return result.toString();
    }

}
