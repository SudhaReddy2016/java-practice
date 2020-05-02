package com.practice.basics.keywords.statickeyword;

public class PracticeStaticConstructor
 {
	static String name;
	static int number;
	public PracticeStaticConstructor(){
		name = "Dhana";
		number = 12345;
	}
	public static void main(String str[]){
		PracticeStaticConstructor psc = new PracticeStaticConstructor();
		
		System.out.println(psc);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeStaticConstructor [name=" + name + ", number=" + number
				+ "]";
	}

}
