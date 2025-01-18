package com.demo.interview.mathproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNthSmallNumber {

    public static void main(String args[]) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(99,345,2,12,24,12,275));

        int[] inputArray = new int[] {99,345,2,12,24,12,275};

        System.out.println(Integer.valueOf(findNthSmallNumber(inputArray, 4)));
        inputList.remove(Integer.valueOf(findNthSmallNumber(inputArray, 4)));
        System.out.println(inputList);
    }

    public static int findNthSmallNumber(int[] inputArray, int nthNum) {

        for (int idx = 0; idx < nthNum; idx++) {
            int curr = idx;
            for (int j = curr+1; j < inputArray.length;j++) {
                if (inputArray[curr] > inputArray[j]) {
                    int num = inputArray[curr];
                    inputArray[curr] = inputArray[j];
                    inputArray[j] = num;
                }
            }
        }

        return inputArray[nthNum-1];

    }
}