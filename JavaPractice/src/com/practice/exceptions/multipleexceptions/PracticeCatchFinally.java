package com.practice.exceptions.multipleexceptions;

public class PracticeCatchFinally {
	int a = 184;
	int b = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try{
			s = null;
			System.out.println(s.length());
		}
	catch(NullPointerException npe){
			System.out.println(npe);
	//		System.out.println(184/0);
	//		}
	//	catch(Exception e){
			
			int data = 184/0;
			System.out.println(data);
		}
	finally{
			System.out.println("Tom & Jerry");
		}
		System.out.println("In Cartoons");
		

	}

}
