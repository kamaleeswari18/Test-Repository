package com.array;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {6,12,34,5,7,98,45,1,66};
		int temp;
		for(int i=0;i<ar.length;i++)//pick up one element at time
		{
			for(int j=i+1;j<ar.length;j++) //it will compare the element with the rest
			{
				if(ar[j]>ar[i])
				{
					temp=ar[i];//interchanging the value
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
