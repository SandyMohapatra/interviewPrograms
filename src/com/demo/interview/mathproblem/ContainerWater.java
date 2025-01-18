package com.demo.interview.mathproblem;

public class ContainerWater {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,25,7}));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int diff = (j-i-1)<=0 ? 1 : (j-i-1);
        int area = Math.min(height[i],height[j])*diff;
        int opt = 1;
        while (i < j) {
            int currArea = Math.min(height[i+1],height[j])*(j-i-1);
            if (currArea > area) {
                area = currArea;
            } else {
                currArea = Math.min(height[i+1],height[j-1])*(j-i-1);
                if (currArea > area) {
                    area = currArea;
                }
            }
            if (opt == 1) {
                j--;
            } else {
                i++;
            }

            if (opt == 1 && (i-j)<2) {
                opt++;
                j = height.length-1;
            }
        }

        return area;
    }

}
