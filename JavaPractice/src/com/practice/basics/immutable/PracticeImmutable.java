package com.practice.basics.immutable;
//immutable - data never change once instance is created
public class PracticeImmutable {
     public int number;
	
	public PracticeImmutable(int number){
		this.number = number;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PracticeImmutable pi = new PracticeImmutable(10);
		//System.out.println(pi);
		pi.number = 15;
		System.out.println(pi);
		/*
		String str = new String("Dhana");
		String str1 = new String("Sudha");
	    System.out.println(str);
		System.out.println(str1);
		String concat = str.concat(str1);
		System.out.println(concat);
		System.out.println(str.concat(str1));
		
		str = new String("Reddy");
		System.out.println(str);*/
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeImmutable [number=" + number + "]";
	}

}
