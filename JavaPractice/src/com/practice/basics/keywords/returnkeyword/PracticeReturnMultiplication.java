package com.practice.basics.keywords.returnkeyword;

public class PracticeReturnMultiplication {
	
	public int multiplication(int a,int b){

		int c = a * b;
		return c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeReturnMultiplication prm = new PracticeReturnMultiplication();
		int c= prm.multiplication(10, 10);
		System.out.println(c);

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeReturnMultiplication []";
	}

}
