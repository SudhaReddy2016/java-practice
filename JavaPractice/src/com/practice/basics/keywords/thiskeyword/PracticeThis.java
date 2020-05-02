package com.practice.basics.keywords.thiskeyword;
//this keyword refers to the current class of instance variable.
//this keyword can be invoked current class constructor.
//this can be used to return current class instance from the method.

//without  constructor
public class PracticeThis {
	
	public void  name(){
		System.out.println("Dhana");
		
	}
	public void number(){
		System.out.println(7981331);
		this.name();
	
	}
	public static void main(String str[]){
		PracticeThis pat = new PracticeThis();
		pat.name();
		pat.number();
		
	}
}
