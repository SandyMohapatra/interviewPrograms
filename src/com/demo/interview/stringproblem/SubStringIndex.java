package com.demo.interview.stringproblem;

public class SubStringIndex {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(solution(53, 1953786));
        System.out.println(solution(78, 195378678));
        System.out.println(solution(57, 1953786));
        System.out.println(solution(537, 1953786));
        System.out.println(solution(537, 537235537));
        System.out.println(solution(537, 537));
        System.out.println(solution(1234, 551231234));
    }

    public static int solution(int A, int B) {
        // Implement your solution here
        String aStr = Integer.toString(A);
        String bStr = Integer.toString(B);
        int res = -1;

        int aIdx = 0;
        int bIdx = 0;

        while(bIdx < bStr.length()) {

            if (aStr.charAt(aIdx) == bStr.charAt(bIdx)) {
                if (aIdx == aStr.length()-1) {
                    return bIdx - aIdx;
                }
                aIdx++;
            } else if (aStr.charAt(0) == bStr.charAt(bIdx)) {
                aIdx = 1;
            } else {
                aIdx = 0;
            }
            bIdx++;
        }

        return res;
    }

}
