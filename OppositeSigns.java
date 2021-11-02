package com.company;
import java.util.Scanner;
class OppositeSigns {
   
    static boolean oppositeSigns(int No1, int No2)
    {
        return ((No1 ^ No2) < 0);
    }
       
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number : ");
		int No1 = sc.nextInt();	
		
		System.out.print("Enter 2nd Number : ");
		int No2 = sc.nextInt();

        if (oppositeSigns(No1, No2) == true)
            System.out.println("Signs are opposite");
        else
            System.out.println("Signs are Same");
    }
}
  