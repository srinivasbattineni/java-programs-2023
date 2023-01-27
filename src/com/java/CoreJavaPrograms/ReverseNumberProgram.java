		package com.java.CoreJavaPrograms;
		
		
		public class ReverseNumberProgram   
		{  
		public static void main(String[] args)   
		{  
		int number = 12211;
		int reverse = 0;
		int temp;
		temp=number;
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		} 
		System.out.println(reverse);
		if(temp==reverse){
			System.out.println("palindrome");
		}
		else
			System.out.println("Not Palindrome");
		}  
		}  
