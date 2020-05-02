package com.practice.basics.keywords.thiskeyword;
//with constructor
public class PracticeThisConstructor {
	
	public String name;
	public int number;
     
	public PracticeThisConstructor(String name,int number){
		this.name = name;
		this.number = number;
	}
	public void constructor(){
		System.out.println(name);
		System.out.println(number);
	}
//	public  String toString(){
//		 return "PracticThis(name = "+name+" , number = "+number+")";
//	}
	
	public static void main(String str[]){
	
		PracticeThisConstructor pt = new PracticeThisConstructor("Pinky",9666);
		pt.constructor();
//	    pt.name = "Sudha";
//	    pt.number = 54673;
		
	//if we do not use method ,we use tostring .
		// it we use method , no need to use tostring.
		
	}
}