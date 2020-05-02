package com.practice.basics.loops;

public class PracticeNestedForLoop {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeNestedForLoop pdfl = new PracticeNestedForLoop();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.println(j);
			}
			System.out.println(i);
		}
		System.out.println(pdfl);

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeDoubleForLoop []";
	}

}
