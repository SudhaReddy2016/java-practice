package com.practice.basics.keywords.finalkeyword;
//final variable cannot be changed
public class PracticeFinalVariable {
	
	final int number = 9666;
	public PracticeFinalVariable(int number){
		/*this.*/number = number;
	}
	public static void main(String str[]){
		PracticeFinalVariable pfv = new PracticeFinalVariable(824707);
		System.out.println(pfv);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeFinalVariable [number=" + number + "]";
	}

}
