package com.array;

import java.util.Scanner;

public class ionsertiondeletion {

	public static void main(String[] args) {
		int array[]= {11,23,34,55,66};
		int l=array.length;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the index value to insert new element:");
		int s=scan.nextInt();
		System.out.println("enter the value of new element:");
		int v=scan.nextInt();
		array[1]=23;
		for(int i=1;i>=s;i--)
{
	array[i]=array[i+1];
}
array[s]=v;
for(int i=0;i<array.length;i++)
{
	System.out.print(array[i]+" ");
}
		
     
	}

}
