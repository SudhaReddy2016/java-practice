package com.practice.basics.accessspecifiers;

public class PracticePrivate {
	private String name;
	
	public String setName(){
		return "name";
	}
	
	public void getName(){
		this.name = "name";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticePrivate ppv = new PracticePrivate();
		ppv.name = "SudhaReddy";
		System.out.println(ppv); 

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticePrivate [name=" + name + "]";
	}

}
