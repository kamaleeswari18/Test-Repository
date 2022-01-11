package com.array;

import java.util.Scanner;

public class Averagenumber {

	public static void main(String[] args) {
		int ar[]=new int[10];//array declaration
		Scanner in=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<10;i++)//initializing
		{
			ar[i]=in.nextInt();
		}
		int s=0;for(int i=0;i<10;i++)
		{
			s=s+ar[i];//sum of all elements
		}
		System.out.println(ar.length);
		
		System.out.println("Äverage="+s/ar.length);

	}
}


