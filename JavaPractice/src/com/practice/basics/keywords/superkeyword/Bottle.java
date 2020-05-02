package com.practice.basics.keywords.superkeyword;

public class Bottle  extends Plastic{

	public String name = "Steel";
	
	public void Bottle(){
	
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public static void main(String str[]){
		Bottle b = new Bottle();
		b.Bottle();
	}
	
}