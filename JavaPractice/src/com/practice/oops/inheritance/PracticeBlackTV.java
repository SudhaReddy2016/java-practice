package com.practice.oops.inheritance;

public class PracticeBlackTV {
	public int year = 2000;
	public int cost = 10000; 
	
	public String blackTVDetails(){
		return "BlackTV Details";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeBlackTV [year=" + year + ", cost=" + cost + "]";
	}

	

}
