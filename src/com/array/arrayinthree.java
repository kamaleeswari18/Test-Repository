package com.array;

import java.util.Scanner;

public class arrayinthree {

	public static void main(String[] args) {
		int ar[]= {12,21,34,56,98,2,3,9,123,56,88,31,71};
		int evenar[]= new int[10];
		int oddar[]= new int[10];
		
		int i,j=0,k=0;
		
		
		for(i=0;i<ar.length;i++)
		
	{
			if(ar[i]%2==0)
			{
				evenar[j]=ar[i];
				j=j+1;
			}
			else
			{
				oddar[k]=ar[i];
				k=k+1;
			}
		}
		for(i=0;i<j;i++)
			System.out.println(evenar[i]+ " ");
		System.out.println();
		
		for(i=0;i<k;i++)
		{
			System.out.print(oddar[i]+ " ");
		}

		{

	}
	}
}

