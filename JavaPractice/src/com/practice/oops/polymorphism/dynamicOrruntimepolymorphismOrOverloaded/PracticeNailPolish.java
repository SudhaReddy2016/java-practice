package com.practice.oops.polymorphism.dynamicOrruntimepolymorphismOrOverloaded;

public class PracticeNailPolish  extends PracticeNails{
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeNailPolish [name=" + name + ", number=" + number + "]";
	}

	public String name;
	public int number;
	public void nails(){
		//System.out.println("Hyderabad");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeNailPolish pnp = new PracticeNailPolish();
		pnp.name = "juice";
		pnp.number = 1234;
		System.out.println(pnp);
		
		PracticeNails pn = new PracticeNails();
		pn.name = "dazler";
		pn.number = 4567;
		System.out.println(pn);

	}

}
