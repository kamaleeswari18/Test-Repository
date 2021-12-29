package com.data.input;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n,i,fact=1;
		
		System.out.println("Enter a number to calulate factorial:");
		n=ob.nextInt();
		for (i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial="+fact);
		ob.close();
		
	}

}
