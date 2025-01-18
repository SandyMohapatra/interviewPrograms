package com.demo.interview.mathproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestPostiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A = new int[]{1, 3, 6, 4, 1, 2};
		//int[] A = new int[]{1, 3, 2};
		//int[] A = new int[]{-1, -3};
		int[] A = new int[]{-1, 1, 2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        // Implement your solution here
		Arrays.sort(A);
		int res = 1;
		for(int curr:A) {
			if (res==curr && curr>0) {
				res++;
			}
		}
		return res;
    }

}
