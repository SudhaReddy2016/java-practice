package com.practice.basics.keywords.thiskeyword;
//this keyword cannot be over ride
public class PracticeThisTwo extends PracticeThisone {
	public void practiceTwo(){
		System.out.println("huii");
		//this.practiceThis();
	}

	public static void main(String[] args) {
		
		PracticeThisTwo ptt = new PracticeThisTwo();
		ptt.practiceTwo();
		System.out.println(ptt);
	}

}
