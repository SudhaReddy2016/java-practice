package com.practice.basics.accessspecifiers;

public class practicePublic {
	public String name;
	public int number;
	
	public void pen(){
		System.out.println("blue");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practicePublic pp = new practicePublic();
		pp.pen();

	}

}
