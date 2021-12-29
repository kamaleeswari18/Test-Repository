package com.test;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number");
		int n=sc.nextInt();
		int r,s=0,k=n;
		while(n>0)
		{
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
			
		}
		//System.out.println(s);
		if(s==k)
		{
			
			System.out.println(k+"is a Armstrong number");
			
		}
		else
		{
			System.out.println(k+"is not a Armstrong number");
			
		}
		

	}

}
