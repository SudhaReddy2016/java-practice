package com.practice.basics.keywords.finalkeyword;
//final method cannot be overrided
public class PracticeFinalMethod {
	final int max;
	 public  PracticeFinalMethod(){
		  max = 100;
	 }
	 public void method(){
		 System.out.println(max);
	 }
	 public static void main(String str[]){
		 PracticeFinalMethod pfm = new PracticeFinalMethod();
		 pfm.method();
	 }

}
//    class Bike extends PracticeFinalMethod(){
//    	
//    }
    	
    
