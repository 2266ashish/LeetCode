package com.leetcode.week001;

/*
1929. Concatenation of Array
https://leetcode.com/problems/concatenation-of-array/description/
*/
public class Day01_ArrayConcatenation {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] result = concatenation(arr);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] concatenation(int[] arr) {
        int[] result = new int[arr.length * 2];
        for(int i=0; i<result.length ; i++) {
            if(i<arr.length){
                result[i]=arr[i];
            }else {
                result[i]=arr[i-arr.length];
            }
        }
        return result;
    }
}

