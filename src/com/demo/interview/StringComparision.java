package com.demo.interview;

public class StringComparision {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1 = "Sunday";
        String s2 = "Sunday";
        System.out.println(s1 == s2);

        String s3 = new String("Sunday");
        System.out.println(s1 == s3);

        String s4 = new String("Sunday").intern();
        System.out.println(s1 == s4);
    }

}
