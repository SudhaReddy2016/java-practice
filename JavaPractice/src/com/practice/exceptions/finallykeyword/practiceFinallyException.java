package com.practice.exceptions.finallykeyword;

public class practiceFinallyException {
	int a = 199;
	int b = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int data = 199/0;
		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		finally{
			System.out.println("Navaneeswar Reddy");
		}

	}

}
