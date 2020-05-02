package com.practice.basics.mutable;
//mutable - data can change on same instance
public class PracticeMutable {
	public int number;
	
	public PracticeMutable(int number){
		this.number = 16;
	}

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMutable pm = new PracticeMutable(10);
		//System.out.println(pm);
		pm.number = 12;
		System.out.println(pm);

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeMutable [number=" + number + "]";
	}

}
