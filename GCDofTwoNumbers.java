package com.company;
import java.util.Scanner;

public class GCDofTwoNumbers {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Integer Value : ");
		int No1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Integer Value : ");
		int No2 = sc.nextInt();

        int GCD = 0;

		for(int i = 1; i <= No1 && i <= No2; i++)
	    {
	        if(No1 % i == 0 && No2 % i == 0)
	        {
	            GCD = i;
	        }
	    }	
		System.out.println("The GCD of " + No1 + " and " + No2 + "  =  " + GCD);
	}

      

}
