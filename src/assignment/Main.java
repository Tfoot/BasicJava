package assignment;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        Write a program to print the sum and average of the even and odd numbers separately given on command line argument.
        Scanner sc=new Scanner(System.in);
        int n,oddsum=0,evensum=0;
        System.out.println("How many numbers you want to enter: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int count=i+1;
            System.out.println("Enter "+count+" value: ");
            if(arr[i]%2==0){
                evensum=evensum+arr[i];
            }
            else
                oddsum=oddsum+arr[i];
        }
        System.out.println("The sum of odd integers: "+oddsum);
        System.out.println("The sum of even integers: "+evensum);

    }
}
