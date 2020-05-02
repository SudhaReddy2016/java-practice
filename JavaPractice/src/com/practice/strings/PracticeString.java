package com.practice.strings;

public class PracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] sg = {"There ","is ","a ","student" ,"in" ,"class"};
	
		for(int i=0;i<sg.length;i++){
			int count = 0;
			for(int j=0;j<sg.length;j++){
				count ++;
				if(sg[i] == sg[j] )
					System.out.println(j+":"+sg[i]);	
				}
		}
	
		int c = sg.length;
			System.out.println(c);
			
			
		}
		}


