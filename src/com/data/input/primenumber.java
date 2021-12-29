package com.data.input;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the prime number:");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n % i==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
			
		
			

	


