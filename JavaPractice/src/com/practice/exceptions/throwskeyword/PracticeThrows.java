package com.practice.exceptions.throwskeyword;

class MyExeption extends Exception {
	MyExeption(String s) {
		super(s);
	}
}

public class PracticeThrows {
	void testExe() throws MyExeption {
		try {
			throw new MyExeption("Testing");
		} catch (MyExeption e) {
			throw new MyExeption(e+" : My custom Exception Testing");
		}
	}

	/*public void name() throws ArithmeticException {
		throw new ArithmeticException("SudhaReddyChalla");
	}

	public void number() throws ArithmeticException {
		name();
	}

	public void location() {

		try {
			number();

		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
	}
*/
	/**
	 * @param args
	 */
	public static void main(String str[]) {
		// TODO Auto-generated method stub
		PracticeThrows pt = new PracticeThrows();
	/*	pt.location();
		System.out.println(pt);*/
		try {
			pt.testExe();
		} catch (MyExeption e) {
			// TODO Auto-generated catch block
			System.out.println("Sample : "+e.getMessage());
			e.printStackTrace();
		}
	}

}
