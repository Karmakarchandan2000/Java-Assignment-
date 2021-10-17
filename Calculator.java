package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	System.out.println("Calculator Program");
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your First No: ");
    int no1=sc.nextInt();
    System.out.println("Enter Your First No: ");
    int no2=sc.nextInt();
    System.out.println("What you want to do (+,-,*,/) : ");
    String sym=sc.next();

    int res;

        switch (sym) {
            case "+":
                res = no1 + no2;
                System.out.println("Addition is : " + res);
            break;

            case "-":
                res = no1 - no2;
                System.out.println("Subtraction is : " + res);
            break;

            case "*":
                res = no1 * no2;
                System.out.println("Multiplication is : " + res);
            break;
            
            case "/":
                res = no1 / no2;
                System.out.println("Division is : " + res);
                break;

            default:
                System.out.println( "You Enter an Invalid Symbol");
            break;

        }

    }
}
