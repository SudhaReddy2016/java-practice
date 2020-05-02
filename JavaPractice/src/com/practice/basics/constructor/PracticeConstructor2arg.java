package com.practice.basics.constructor;

public class PracticeConstructor2arg {
	public String name;
	public int number;
	
	public PracticeConstructor2arg(String name,int number){
		this.name = "sudha";
		this.number = 96628;
	}
	public static void main(String str[]){
		PracticeConstructor2arg pc1 = new PracticeConstructor2arg("Dhana",824707);
		System.out.println(pc1);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeConstructor1arg [name=" + name + ", number=" + number
				+ "]";
	}

}
