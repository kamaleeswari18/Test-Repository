package com.data.input;

public class OperatorTest {

	public static void main(String[] args) {
		
		int a=56,b=76,c=35,x=10,y=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a>b && b>c);
		System.out.println(a>b || b>c);//or 
		System.out.println(a!=b);//not 
		System.out.println(a==b);
		
		a+=5;
		System.out.println(a);//adding value of a; 
		
		 a-=5;
		 System.out.println(a);
		 
		 a*=2;
		 System.out.println(a);
		 
		 a/=4;
		 System.out.println(a);
		 
		 System.out.println(a&b);
		 System.out.println(a|b);
		 System.out.println(a>>2);
		 System.out.println(a<<2);
		 
		 y=(20>30)?20:30;
		 System.out.println(y);
		 
		 System.out.println(++x - --x + ++x);
		 System.out.println(x);
		 
		 a=10;
		 b=17;
		 System.out.println(++a + --b - b-- + ++a * b--);
		 
	
		 
		   
		 
		 
		 
		 
	

	}

}
