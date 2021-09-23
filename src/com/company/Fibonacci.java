package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int n=7,n1=0,n2=1;
        int sum=0;
        for(int i=2;i<n;i++){
            if(n==0){
                break;
            }
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        System.out.println(sum);
    }
}
