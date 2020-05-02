package com.practice.exceptions.catchkeyword;

public class PracticeCatchArithmetic {
	
	 static int a = 69;
	 static int b = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
		int data = 69/0;
		}
		catch(ArithmeticException ae){
			System.out.println(a/(b+2));
		}
		System.out.println("Result");
		
		

	}

}
