package com.test;

import java.util.Scanner;

public class perfectrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0,n;
		System.out.println("Enter the lower number");
		int l=sc.nextInt();
		System.out.println("Enter the Upper number");
		int u=sc.nextInt();
		for(int j=1;j<=u;j++)//j=100 100<=1000
		{
			s=0;
			for(int i=1;i<j;i++)
			{
				if(j%i==0)
				{
					s=s+i;
					
				}
			}
		}
	}
}
		

	


