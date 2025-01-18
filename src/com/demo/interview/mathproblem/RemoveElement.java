package com.demo.interview.mathproblem;


public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(removeElement(new int[] {1,3,2,3,2}, 2));
		System.out.println(removeElement(new int[] {3,2,2,3}, 3));
		System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
	}
	
	public static int removeElement(int[] nums, int val) {
		int[] res = new int[nums.length];
		int resInt = 0;
		for (int num : nums) {
			if (num != val) {
				res[resInt] = num;
				resInt++;
			}
		}
		nums = res;
        return resInt;
    }

}
