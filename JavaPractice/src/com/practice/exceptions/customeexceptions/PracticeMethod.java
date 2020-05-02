package com.practice.exceptions.customeexceptions;

class PracticeCustome extends Exception {

	public PracticeCustome(String name) {
		super(name);
	}

}

public class  PracticeMethod {

	public String method2() throws PracticeCustome {
		try {
			throw new Exception("Hii");
		} catch (Exception ce) {
			System.out.println("ce");
			throw new PracticeCustome("Sudha reddy");
		}
	}
	public String method1() {
		try {
			method2();
			
		} 
		catch(PracticeCustome pc){
			System.out.println("pc");
		}
		catch (Exception e) {
			System.out.println("Dhanush");
		}
		return "method1";
	}

	public static void main(String[] args) {
		PracticeMethod pc = new PracticeMethod();
		System.out.println(pc.method1());

	
}

}


