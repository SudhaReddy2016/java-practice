package com.practice.exceptions.throwkeyword;

public class PracticeThrow {
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException("major");
		}
		else
			System.out.println("minar");
		
	}
			public static void main(String strr[]){
				
			validate(15);
			System.out.println("hiii");		
	}

}
