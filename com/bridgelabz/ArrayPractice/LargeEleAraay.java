package com.bridgelabz.ArrayPractice;

public class LargeEleAraay {
    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 13, 4, 5, 6, 17, 8, 9, 10, 11};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);

    }

        }

