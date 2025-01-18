package com.demo.interview.mathproblem;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(divide(10, 3));
        //System.out.println(divide(7, -3));
        //System.out.println(divide(1, 1));
        //System.out.println(divide(-2, 1));
        System.out.println(divide(-2147483648, -1));
    }

    public static int divide(int dividend, int divisor) {
        long q = 0;
        long lDividend = (long)dividend;
        long ldivisor = (long)divisor;
        long num = (ldivisor<0)? -ldivisor: ldivisor;
        long sum = num;
        long absDividend = (lDividend<0)? -lDividend: lDividend;
        while (absDividend >= sum) {
            sum += num;
            q++;
        }
        if (ldivisor == lDividend) {
            return 1;
        } else if (!(ldivisor < 0 && lDividend < 0)) {
            if (lDividend < 0 || ldivisor < 0) {
                return (int) -q;
            }
        } else if (q-1 == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int) q;
    }
}
