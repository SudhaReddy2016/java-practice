package com.practice.basics.constructor;

public class PracticeConstructor1arg{
	public int number;
	public PracticeConstructor1arg(int number){
		this.number = number;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeConstructor1arg pc = new PracticeConstructor1arg(81860);
		System.out.println(pc);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeConstructor1arg [number=" + number + "]";
	}

}
