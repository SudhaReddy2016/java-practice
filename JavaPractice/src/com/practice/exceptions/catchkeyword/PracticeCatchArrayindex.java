package com.practice.exceptions.catchkeyword;

public class PracticeCatchArrayindex{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4,7,2,8};
		try{
		System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println(aie);
		}
		System.out.println("Nagarjuna Reddy");

	}

}
