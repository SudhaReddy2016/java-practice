package com.practice.oops.interfacekeyword;

public  class PracticeCell implements PracticeBattery {

	public String names;
	public int number;
	public  String battery(){
		return "sudha";
	
	}
	public void battery1(){
		System.out.println("Dhanush");
	}
	public void headphones(){
		this.names = names;
		this.number = number;
		System.out.println("Dhana");
		System.out.println(7981331);
	System.out.println("headphones");
	}
	public static void main(String str[]){
		PracticeCell pc = new PracticeCell();
		pc.battery();
		pc.battery1();
		pc.headphones();
		
	}
}
