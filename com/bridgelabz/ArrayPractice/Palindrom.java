package com.bridgelabz.ArrayPractice;

public class Palindrom {
    public static void main(String args[]) {
        int n =121;
       int reverseNum=0;
       for(int i=n; i !=0; i/=10)
        {
            int remainder = i%10;
            reverseNum = reverseNum * 10 + remainder;
        }

        if (n==reverseNum){
            System.out.println(n + " is palindrom");
        }
        else{
            System.out.println(n + " is not palindrom");
        }
        }
    }

