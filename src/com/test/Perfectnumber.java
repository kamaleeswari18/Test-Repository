package com.test;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0;
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s=s+i;
			}
		}
		if(s==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+"is a not perfect number");
			}
		}

	}


