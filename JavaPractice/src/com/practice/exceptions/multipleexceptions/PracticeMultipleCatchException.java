package com.practice.exceptions.multipleexceptions;

import java.io.IOException;

public class PracticeMultipleCatchException {
	int a = 15;
	int b =  0;
	int c;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int	c = 15/0;
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aiob){
			System.out.println(aiob);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("CDS");

	}

}
