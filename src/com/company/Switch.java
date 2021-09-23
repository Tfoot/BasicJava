package com.company;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("\t******Choose from the following****** ");
        System.out.println("1. Hello World!");
        System.out.println("2. Intermediate");
        System.out.println("3. Advanced");
        System.out.println("4. Exit");
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        switch (t){
            case 1:
                System.out.println("Hello Beginner!");
                break;
            case 2:
                System.out.println("Welcome back") ;
                break;
            case 3:
                System.out.println("Sir, who would you like to monitor.");
                break;
            case 4:
                System.out.println("You have exited!");
                break;
            default:
                System.out.println("Please choose a valid value");

        }
        System.out.println();
        System.out.println("PROGRAM FINISHED");
    }
}
