package com.practice.threads;

 
public class ExtendsThreadCls implements Runnable {

	public ExtendsThreadCls() {
		super();
		Thread t=new Thread(this);
		t.start();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThreadCls t = new ExtendsThreadCls();
		 
	}

	@Override
	public void run() {
		System.out.println("JJJ");
		
	}

	 
 

}
