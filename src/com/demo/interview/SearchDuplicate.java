package com.demo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchDuplicate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(findDuplicate(Arrays.asList(1,23,45,12,15,87,56,4,9,11,23)));
    }

    public static Integer findDuplicate(List<Integer> numList) {
        List<Integer> traversedList = new ArrayList<>();
        boolean isFound = false;
        int idx =0;
        while (idx < numList.size()) {
            Integer curr = numList.get(idx);
            if (traversedList.contains(curr)) {
                isFound = true;
                break;
            }
            idx++;
            traversedList.add(curr);
        }

        if (isFound) {
            return numList.get(idx);
        } else {
            return -1;
        }
    }

}
