package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Write a program to input n numbers on command line argument and calculate maximum of them.
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int max=-9999;
        System.out.println("Enter the elements of array\n");
        for(int i=0;i<5;i++){
            int count=i+1;
            System.out.print("Enter "+count+ " value: ");
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The highest number among the five is: "+max);
    }
}
