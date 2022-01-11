package com.array;

import java.util.Scanner;

public class deletearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= new int[10];
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enlet array elements:");
		for(int i=0;i<9;i++)
		{
			ar[i]=scan.nextInt();
		}
		int l=ar.length;
		System.out.println("arrays value:");
		for(int i=0;i<9;i++)
		{
		System.out.println(ar[i]);
	    }
		System.out.println("enter the index value to delete  element:");
		int s=scan.nextInt();
		for(int i=0;i<9;i++)
		
		{
			ar[i]=ar[i+1];
		}
		System.out.println("enter the delete element");
		for(int i=0;i<9;i++)
		{
			System.out.println(ar[i]+" ");
	
		
	
		
		}


}

}






