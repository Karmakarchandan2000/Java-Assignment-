package com.company;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers{

    public static void main(String[] args) {
	System.out.println(" Multiplication Of Two Numbers Programs");
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your First No: ");
    int no1=sc.nextInt();
    System.out.println("Enter Your Second No: ");
    int no2=sc.nextInt();

 sc.close();
    int multiplication=no1*no2;
    System.out.println(" Multiplication Of Two Numbers Is: " +multiplication);
       

    }
}
