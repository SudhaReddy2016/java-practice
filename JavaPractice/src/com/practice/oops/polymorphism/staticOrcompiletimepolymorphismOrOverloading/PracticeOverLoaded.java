package com.practice.oops.polymorphism.staticOrcompiletimepolymorphismOrOverloading;

public class PracticeOverLoaded {
	public void overLoaded(){
		System.out.println("1st Class");
	}
	public String overLoaded(String name){
		return "dhanush";
	}
	public int overLoaded(String name,int number){
		if(name == "SudhaReddy"&& number == 416)
		{
			return 6;
		}else
		{
			return 7;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeOverLoaded pol = new PracticeOverLoaded();
		pol.overLoaded();
		
		System.out.println(pol.overLoaded("SudhaReddy", 416));
		System.out.println(pol.overLoaded("SudhaReddy"));

	}
	

}
