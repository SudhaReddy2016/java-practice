package com.practice.basics.keywords.returnkeyword;

public class PracticeReturnAddition {
	public int a;
	public int b;
	public int c;
	
	public int Addition(){
	    a=10;
		b=10;
		c = a+b;
		return c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PracticeReturnAddition ra = new PracticeReturnAddition();
		ra.Addition();
		System.out.println(ra);

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeReturnAddition [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
