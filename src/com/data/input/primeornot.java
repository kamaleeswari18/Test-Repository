package com.data.input;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		
		   Scanner scan=new Scanner(System.in);
	        System.out.println("Enter any number:");
				int n=scan.nextInt();
				int c=0;
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
					{
						//System.out.print(i+ " ");
						c=c+1;
					}
					
				}
				
				System.out.println(c);
				if(c==2)
				{
					System.out.println("prime number");
				}
				else
				{
					System.out.println("non prime number");
				}

			}
}

		


	


