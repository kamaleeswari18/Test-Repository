package com.test;

import java.util.Scanner;

public class palindromenumberonetothous {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the lower number");
		int l=sc.nextInt();
		System.out.println("enter the upper number");
		int u=sc.nextInt();
		int r,a=0,b=0;
		for(int i=1;i<=u;i++)
		{
			a=i;
			b=0;
		    while(a>0)
			  {
		   r=a%10;
		   b=b*10+r;
		   a=a/10;
		   
				
			}
			if(i==b)
			{
				System.out.println(i);
			}
		}
		
		

	}

}
