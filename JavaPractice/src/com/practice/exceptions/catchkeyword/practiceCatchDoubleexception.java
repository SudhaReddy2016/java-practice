package com.practice.exceptions.catchkeyword;

public class practiceCatchDoubleexception {
	int a = 10;
	 int b = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int data = 10/0;
		}
		catch(Exception e){
			
			int data = 10/0;
			System.out.println(data);
		}
		System.out.println("Banglore");

	}

}
