package com.company;
import java.util.Scanner;

    class PallindromeNumber {
        public static void main(String[] args) {

            System.out.println("Pallindrome Number Checking");
            Scanner sc = new Scanner(System.in);
   
            System.out.println(" Enter A Number : ");
            int no=sc.nextInt();

           int revNum = 0, remainder;
          
          int originalNum = no;
          
          while (no != 0) {
            remainder = no % 10;
            revNum = revNum * 10 + remainder;
            no /= 10;
          }
          
          if (originalNum == revNum) {
            System.out.println(originalNum + " is Palindrome.");
          }
          else {
            System.out.println(originalNum + " is not Palindrome.");
          }
        }
      }