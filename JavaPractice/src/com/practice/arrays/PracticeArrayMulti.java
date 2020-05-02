package com.practice.arrays;

public class PracticeArrayMulti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][4];
		a[0][0]=2;
		a[1][1]=3;
		a[2][2]=4;
		a[3][3]=5;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
		}
	}

}
