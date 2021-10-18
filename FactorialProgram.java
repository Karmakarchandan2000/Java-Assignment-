package com.company;
import java.util.Scanner;

public class FactorialProgram {

    public static void main(String[] args) {

        System.out.println(" Factorial Program ");

        Scanner sc = new Scanner(System.in);
   
        System.out.println(" Enter A Number : ");

        int no=sc.nextInt();

        int fact=1;
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }

        System.out.println(" Factorial of " +no+ " is :" +fact);
    }
}