package com.array;

import java.util.Scanner;

public class deletion {

	public static void main(String[] args) {
		int array[]= new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter arrey element:");
		for(int i=0;i<5;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the index value to remove element:");
		int s=scan.nextInt();
		{
			//System.out.println(array[5]);
		}
		System.out.println("Enter the value of remove element:");
		int v=scan.nextInt(0);
		for(int i=0;i>s;i++)
		{
			array[i]=array [i+1];
			System.out.println(array[5]);
		}
	}
}
		
		
	
			
		

	


