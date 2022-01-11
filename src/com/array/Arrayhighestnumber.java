package com.array;

import java.util.Scanner;

public class Arrayhighestnumber {

	public static void main(String[] args) {
		int ar[]=new int[10];//array declaration
		Scanner in=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<10;i++)//initializing
		{
			ar[i]=in.nextInt();
			
		}
		int max=ar[0];
		for(int i=0;i<10;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("Maximum number="+max);

	}

}
