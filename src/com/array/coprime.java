package com.array;

import java.util.Scanner;

public class coprime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int gcd=0;
		for(int i=1;i<=a && i<=b;i++)   // 11,15        12,14
		{
			if(a%i==0 && b%i==0) //11%1==0 && 15%1==0 1,2,3
			{
				gcd=i;
			}
		}
		
		if(gcd==1)
		{
		 System.out.println("Numbers are Co-prime");	
		}
		else
		{
		 System.out.println("Numbers are not Co-prime");	
		}

	}

}
