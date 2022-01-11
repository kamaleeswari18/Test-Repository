package com.array;

import java.util.Scanner;

public class AdditionofMATRIX {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				int row,col;
				System.out.println("Enter number of rows:");
				row=scan.nextInt();
				
				System.out.println("Enter number of columns:");
				col=scan.nextInt();
				
				int ar1[][] = new int[row][col];
				int ar2[][] = new int[row][col];
				int result[][] = new int[row][col];
				System.out.println("Enter the elements of first matrix");
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.println("Enter value");
						ar1[i][j]=scan.nextInt();
					}
					System.out.println();
				}
				
				
				System.out.println("Enter the elements of second matrix");
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.println("Enter value");
						ar2[i][j]=scan.nextInt();
					}
					System.out.println();
				}
	
for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			result[i][j]=ar1[i][j]+ar2[i][j];
		}
		
	}

	System.out.println("Resultant matrix:");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(result[i][j] + " ");
		}
		System.out.println();
	}
	
}



	}




		


	


