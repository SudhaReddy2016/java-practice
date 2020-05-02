 package com.practice.basics.keywords.statickeyword;

public class PracticeStaticShared {
	static int number;
	public void shared(){
		System.out.println( "hiii");
	}
	public static void main(String str[]){
		PracticeStaticShared ss = new PracticeStaticShared();
		ss.shared();
		PracticeStaticShared.number = 3;
		System.out.println(PracticeStaticShared.number);
		PracticeStaticShared ss1 = new PracticeStaticShared();
		PracticeStaticShared.number = 4;
		System.out.println(PracticeStaticShared.number);
	}
	
}
