package com.practice.exceptions.customeexceptions;

public class PracticeExceptionReturn {
	
	public int method2(){
		int name = 0 ;
			int name1=1;
			int name2=2;
			int name3=3;
	try {
	throw new NullPointerException("npe");
	
		//return name1;
	}
/*	catch(NullPointerException ne){
		
		return name2;
		}*/
	finally{
		return name3;
	}
		}
	public int method1(){
		int name4=4;
		return name4; 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeExceptionReturn pt = new PracticeExceptionReturn();
		System.out.println(pt.method1());
		System.out.println(pt.method2());

	}

}
