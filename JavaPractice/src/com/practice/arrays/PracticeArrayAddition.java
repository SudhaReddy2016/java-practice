package com.practice.arrays;
//array is an object which contains elements of similar data type.
//The elements of array are stored in contiguous memory.
//Array is index-based.It is of two types multi-dimensional &single dimensional
public class PracticeArrayAddition {
  
	public int a[][];
	public int b[][]; 
	public static int c[][]=new int [3][3];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][]= {{1,2,4},{1,2,3},{2,3,4}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				
				c[i][j] = a[i][j]+b[j][j];
				System.out.print(c[i][j]+ " ");
			}
			 System.out.println();
		}
     
	}

}
