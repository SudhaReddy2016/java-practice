package com.practice.basics.constructor;
//Constructor means newly initialized object.Every new keyword,Constructor is created.
//Constructor cannot be abstract,final,static & synchronized.
//if there is no constructor available in class,java compiler provides default constructor. 
//0-argument constructor
public class PracticeConstructor0Arg {
 
	public String name;
	public int number;
	
	public PracticeConstructor0Arg(){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeConstructor0Arg pc = new PracticeConstructor0Arg();
		pc.name = "Dhanush";
		pc.number = 7981331;
		System.out.println(pc);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeConstructor0Arg [name=" + name + ", number=" + number
				+ "]";
	}

}
