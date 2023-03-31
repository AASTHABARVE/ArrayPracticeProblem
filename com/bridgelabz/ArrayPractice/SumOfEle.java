package com.bridgelabz.ArrayPractice;

public class SumOfEle {
    public static void main(String dd[]) {
        int[] arr = new int[]{1, 2, 13, 4, 5};
        for (int i = 0; i <=arr.length; i++) {
            System.out.println(arr[i]);
            int sum=0;
            sum = sum + arr[i];
            System.out.println(sum);

        }
    }
}