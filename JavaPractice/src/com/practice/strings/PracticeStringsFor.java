package com.practice.strings;

public class PracticeStringsFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tr = "Nagarjuna Reddy";
		char c = tr.charAt(10);
		System.out.println(c);
		
		System.out.println(tr);
		
		char[] ar = tr.toCharArray();
		for(int i=tr.length()-1;i>0;i--){
			System.out.println(tr.charAt(i));
		}
		
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}

	}

}
