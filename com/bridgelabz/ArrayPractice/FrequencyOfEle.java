package com.bridgelabz.ArrayPractice;

public class FrequencyOfEle {
    public static void main(String args[]) {
        int[] arr = new int[]{10, 2, 13, 10, 2, 6, 17, 8, 2, 10, 11};
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            int freq = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    arr[j] = 0; // set the repeated element to 0
                }
            }
            if (arr[i] != 0) {
                System.out.println(arr[i] + " occurs " + freq + " times");
            }
        }
        }
    }
