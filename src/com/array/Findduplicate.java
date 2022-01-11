package com.array;

import java.util.Scanner;

public class Findduplicate {

	public static void main(String[] args) {
		int ar[]=new int[10];//array declaration
		Scanner in=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<10;i++)//initializing
		{
			ar[i]=in.nextInt();
			
		}
		System.out.println("Ënter any number to search");
		int s=in.nextInt(),c=0;
		for(int i=0;i<10;i++)
		{
			if(ar[i]==s)
			{
				c=c+1;
			}
		}
		if(c==1)
		{
			System.out.println("Unique number");
		}
		else
		{
		System.out.println("Duplicate number");


	}

	}
}
