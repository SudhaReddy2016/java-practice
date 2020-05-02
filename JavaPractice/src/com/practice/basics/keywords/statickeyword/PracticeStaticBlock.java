package com.practice.basics.keywords.statickeyword;
//static key word is used only memory management only.static elements will stored in static memory.
//if we declare any variable as static,it is static variable.it is used to refer common property of all objects.ex:company name of employee
//static method can be invoked without creating instance.
//static memory is a shared memory.
//static block will be executed at the time of class loading.
public class PracticeStaticBlock {
	
	static String name;
	
	static
	{
		System.out.println("I am a Devil ");
	}
     public static void main(String str[]){
	 
    }
}
