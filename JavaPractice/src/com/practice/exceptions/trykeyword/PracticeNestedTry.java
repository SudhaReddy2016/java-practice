package com.practice.exceptions.trykeyword;

import java.io.IOException;

public class PracticeNestedTry {
	public int a = 10;
	public int b = 0;
	
	public static void main(String[] args) {
		
	try{
		try{
		int data = 10/0;
	}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
		try{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException npe){
			System.out.println(npe);
	}
		try{
			throw new IOException("Dhanush");
		}
		catch(IOException io){
			System.out.println(io);
		}
		System.out.println("World");
	}
		catch(Exception e){
			System.out.println(e);
		}
	
	/**
	 * @param args
	 */
	
	
	}
}
