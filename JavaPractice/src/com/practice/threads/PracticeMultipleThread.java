package com.practice.threads;

public class PracticeMultipleThread  implements Runnable{
	public void run(){
		System.out.println("Hiii");
	}

	public static void main(String[] args) {
		PracticeMultipleThread  pmt = new PracticeMultipleThread();
		Thread one = new Thread();
		Thread two = new Thread();
		Thread three = new Thread();
		one.setName("hiii");
		

	}

	
	

	
		
	}


