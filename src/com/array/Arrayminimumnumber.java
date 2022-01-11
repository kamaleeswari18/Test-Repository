package com.array;

import java.util.Scanner;

public class Arrayminimumnumber {

	public static void main(String[] args) {

			int ar[]=new int[10];//array declaration
			Scanner in=new Scanner(System.in);
			System.out.println("Enter elements");
			for(int i=0;i<10;i++)//initializing
			{
				ar[i]=in.nextInt();
				
			}
			int min=ar[0];
			for(int i=0;i<10;i++)
			{
				if(ar[i]<min)
				{
					min=ar[i];
				}
			}
			System.out.println("Minimum number="+min);

		}

	

	}



