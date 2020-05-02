package com.practice.basics.keywords.statickeyword;

public class PracticeStaticVariable {
      static String name;
      static int number;
      static String clg = "A1 GIET";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		PracticeStaticVariable psv = new PracticeStaticVariable();
		PracticeStaticVariable.name = "Sudha";
		PracticeStaticVariable.number = 416;
		System.out.println(PracticeStaticVariable.name);
		System.out.println(PracticeStaticVariable.number);

		PracticeStaticVariable psv1 = new PracticeStaticVariable();
		psv1.name = "Bujji";
		psv1.number = 520;
		System.out.println(psv1);
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeStaticVariable [name=" + name + ", number=" + number
				+ ", clg=" + clg + "]";
	}

}
