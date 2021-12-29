package com.test;

import java.util.Scanner;

public class petersonnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number:");
		int n=sc.nextInt();
		int r,fact=1,i=0,s=0,k=n;
		while(n>0)
		{
			r=n%10;
			fact=1;
			while(r>0)
			{
				fact=fact*r;
				r=r-1;
				n=n/10;
				
			}
			if(s==k)
			{
				System.out.println(k+"is a peterson number");
			}
			else
				System.out.println(k+"is a not peterson number");
			}
		}

	}

