package com.company;

import java.util.Scanner;

public class SumOfThreeNumbers{

    public static void main(String[] args) {
	System.out.println("Sum Of Three Numbers Programs");
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your First No: ");
    int no1=sc.nextInt();
    System.out.println("Enter Your Second No: ");
    int no2=sc.nextInt();
System.out.println("Enter Your Third No: ");
    int no3=sc.nextInt();
 sc.close();
    int sum=no1+no2+no3;
    System.out.println("Sum Of Three Numbers Is: " +sum);
       

    }
}
