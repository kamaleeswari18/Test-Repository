package com.test;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Enter the Lower number:");
		int l=sc.nextInt();
		System.out.println("Enter the Upper number:");
		int u=sc.nextInt();
		for(int i=1;i<=u;i++)//for cheking the range
		{
			c=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					c=c+1;
					
				}
			}
			if(c==2)
			{
				System.out.println(i+" ");
			}
		}
		

	}

}
