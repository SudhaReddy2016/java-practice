package com.practice.basics.keywords.finalkeyword;
//final class can not be inherited.
//final method can not be overrideded.
//final variable can not change.
public final class PracticeFinalClass {
      String name = "Dhanush";
      int number = 12345;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeFinalClass pfc = new PracticeFinalClass();
		System.out.println(pfc);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeFinalClass [name=" + name + ",number="+number+"]";
	}
}

     

   