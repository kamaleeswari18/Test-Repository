package com.array;

import java.util.Scanner;

public class insertdelet1 {

			public static void main(String[] args) {
				int ar[]= new int[10];
				Scanner scan=new Scanner(System.in); 
				System.out.println("Enlet array elements");
				for(int i=0;i<9;i++)
				{
					ar[i]=scan.nextInt();
				}
			
				int l=ar.length;
				
				
				System.out.println("Enter the index value to insert the element :");
				int s=scan.nextInt();
				System.out.println("Enter the value of the new element:");
				int v=scan.nextInt();
				
				
				for(int i=l-1;i>s;i--)
				{
					ar[i]=ar[i-1]; //right shift of all the remaining elements
				}
				
				ar[s]=v;//Enter new data at location s
				
				for(int i=0;i<ar.length;i++)
				{
					System.out.print(ar[i]+" ");
				}


	}

}
