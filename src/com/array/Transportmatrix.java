package com.array;

public class Transportmatrix {

	public static void main(String[] args) {
		int ar[][]= {{1,1,3},{1,1,1},{1,1,3}}; 
		int t[][]=new int[3][3];
		//Static initialization of 2D array
		System.out.println("original matrix");
		for(int i=0;i<3;i++) //check rows
		{
			for(int j=0;j<3;j++) //check columns
			{
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose form of the matrix");
		for(int i=0;i<3;i++) //check rows
		{
			for(int j=0;j<3;j++) //check columns
			{
				t[i][j]=ar[j][i];
				System.out.print(ar[j][i]+ " ");
			}
			System.out.println();
		}
		
		
		int flag=0;
		for(int i=0;i<3;i++) //check rows
		{
			for(int j=0;j<3;j++) //check columns
			{
				if(ar[i][j]!=t[i][j])
				{
					flag=1;
					break;
				}
					
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("Symmetric Matrix");
		}
		else
		{
			System.out.println("Non-Symmetric Matrix");
		}

	}

}



