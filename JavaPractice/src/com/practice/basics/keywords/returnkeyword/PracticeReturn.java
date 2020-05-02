package com.practice.basics.keywords.returnkeyword;
//return is used to complete the execution of a method.
//it is not allowed to use in void method.

public class PracticeReturn {
	public String name;
	public int number;
	
	public String practiceReturn(){
		return name;
	}
	public int practicereturn(){
		return number;
	}
	public static void main(String str[]){
		PracticeReturn pr = new PracticeReturn();
		pr.name = "Sudha";
		pr.number = 824707;
		System.out.println(pr);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeReturn [name=" + name + ", number=" + number + "]";
	}

}
