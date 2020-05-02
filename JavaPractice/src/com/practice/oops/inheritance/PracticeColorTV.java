package com.practice.oops.inheritance;

public class PracticeColorTV extends PracticeBlackTV {
	public int year = 2015;
	public int cost = 15000;
	
	public String colorTVDetails(){
		return "ColorTV Details";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeColorTV pct = new PracticeColorTV();
		pct.colorTVDetails();
		System.out.println(pct);
		
		PracticeBlackTV pbt = new PracticeBlackTV();
		pbt.blackTVDetails();
		System.out.println(pbt);
		
		PracticeBlackTV pt = new PracticeColorTV();
		pt.blackTVDetails();
		System.out.println(pt);
		
		System.out.println(pct.blackTVDetails());
		
		System.out.println(pbt.cost);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeColorTV [year=" + year + ", cost=" + cost + "]";
	}

		

}
