package com.company;
import java.util.Scanner;

public class GreatestNumber{
     
public static void main(String[] args) {
    System.out.println("Enter 3 Numbers: ");
    Scanner sc = new Scanner(System.in);
    int no1 = sc.nextInt();
    int no2 = sc.nextInt();
    int no3 = sc.nextInt();

    if (no1 > no2 && no1 > no3) {
        System.out.println( +no1+  "is Greater");

    } else if (no2 > no1 && no2 > no3) {
        System.out.println( +no2+  "is Greater");

    } else {

        System.out.println( +no3+  "is Greater");

    }
}
}