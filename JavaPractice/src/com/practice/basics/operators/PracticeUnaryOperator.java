package com.practice.basics.operators;
//incrementing/decrementing a value by one(++,--)
//negating an expression(~):negative value
//inverting the value of a boolean(!):if you give true,it becomes false.
public class PracticeUnaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println(i++);//1st value is printed then incremented
		System.out.println(i);//post-increment operator
		
		System.out.println(++i);//1st incremented then printed
		System.out.println(i);//pre-incremented operator
		
		System.out.println(i--);//1st value is printed then decremented
		System.out.println(i);//post-decrement
		
		System.out.println(--i);//1st decremented then printed
		System.out.println(i);//pre-decrement
		
		System.out.println(~i);
		
		boolean c=true;
		System.out.println(!c);

	}

}
