package com.company;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Leap Year Program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Year : ");
        int year=sc.nextInt();

        if (year%400==0)
        {
            System.out.println("This is a Leap Year ");
        }
        else{
            System.out.println("This is not a Leap Year ");

        }
        if (year%4==0)
        {
            System.out.println("This is a Leap Year ");
        }
        else{
            System.out.println("This is not a Leap Year ");

        }
        if (year%100==0)
        {
            System.out.println("This is a Leap Year ");
        }
        else{
            System.out.println("This is not a Leap Year ");

        }


    }
}
