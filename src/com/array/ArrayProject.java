package com.array;

import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		int ar[]=new int[20];//array initialization
		Scanner in=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<10;i++)
		{
			ar[i]=in.nextInt();
			
		}
		for (int i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
