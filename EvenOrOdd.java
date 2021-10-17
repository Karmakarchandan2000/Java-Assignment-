package com.company;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println("Even And Odd Number Checking Program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number: ");
        int no=sc.nextInt();

        if (no%2==0){
            System.out.println("The Number is Even");
        }
        else{
             System.out.println("The Number is Odd");
           
        }

    }

}
