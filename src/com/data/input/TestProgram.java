package com.data.input;

import java.util.Scanner;

public class TestProgram {

public static void main(String[] args) {
		
		Scanner  ob=new Scanner(System.in);
		long a,b;
		float c,d;
		String name="";
		System.out.println("Enter value of a:");
		a=ob.nextLong(); 
		System.out.println("Enter value of b:");
		b=ob.nextLong();
		
		System.out.println("Enter value of c:");
		c=ob.nextFloat(); 
		System.out.println("Enter value of d:");
		d=ob.nextFloat(); 
		
		System.out.println("Enter your name");
		name=ob.next(); 
		
		
		System.out.println("Addition="+(a+b));
		System.out.println("Addition="+(c+d));
		System.out.println(name);
		ob.close(); 



	}

}
