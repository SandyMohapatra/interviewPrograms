package com.demo.interview.mathproblem;

public class CoinCount {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(findCoins(6));
    }

    public static int findCoins(int num) {
        int[] coins = new int[] {11,9,7,5,1};
        int denoIdx = 0;
        int noOfCoins = 0;
        while (denoIdx < 5 && num != 0) {
            int deno = coins[denoIdx];
            if (num >= deno) {
                int q = num / deno;
                if (denoIdx < 3 && (num - (q*deno)) < 5) {
                    q--;
                }
                num = num - q*deno;
                noOfCoins += q;
            }
            denoIdx++;
        }
        return noOfCoins;
    }
}
