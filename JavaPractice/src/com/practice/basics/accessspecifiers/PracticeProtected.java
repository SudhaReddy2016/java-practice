package com.practice.basics.accessspecifiers;

public class PracticeProtected {
	
	public String name;
	public int number;
	
	protected void pencil(){
		System.out.println("eraser");
	}
	
	public static void main(String str[]){
		PracticeProtected ppr = new PracticeProtected();
		ppr.pencil();
		System.out.println(ppr);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeProtected [name=" + name + ", number=" + number + "]";
	}

}
