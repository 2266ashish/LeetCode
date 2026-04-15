package com.leetcode.week001;

public class Day01_002DigitCount {

    public static void main(String[] args) {
        int result = digitCount(123);
        System.out.println(result);
    }

    public static int digitCount(int num) {

        int result=0;
        while(num > 0) {
            num=num/10;
            result++;
        }
        return result;
    }

}
