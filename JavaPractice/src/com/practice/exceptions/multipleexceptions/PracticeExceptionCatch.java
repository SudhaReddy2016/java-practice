package com.practice.exceptions.multipleexceptions;

public class PracticeExceptionCatch {
	int a = 10;
	int b = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		try{
			int data = 10/0;
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
			System.out.println(a[6]);
		}
		catch(Exception e){
			System.out.println(e);
		}
     System.out.println("Rama Devi");
	}

}
