package com.array;

import java.util.Scanner;

public class TwoDarrayDynamic {

	public static void main(String[] args) {
	
				
				Scanner scan=new Scanner(System.in);
				int row,col;
				System.out.println("Enter number of rows:");
				row=scan.nextInt();
				
				System.out.println("Enter number of columns:");
				col=scan.nextInt();
				
				int ar[][] = new int[row][col];
				
				
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.println("Enter value");
						ar[i][j]=scan.nextInt();
					}
					System.out.println();
				}
				
				
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.print(ar[i][j] + " ");
					}
					System.out.println();
				}

			}

		}

