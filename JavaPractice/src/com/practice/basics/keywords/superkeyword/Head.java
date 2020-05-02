package com.practice.basics.keywords.superkeyword;

public class Head extends BodyParts {

	public String name;
    public Head(String name,int number){
     super(name, number);
    	 this.name = "Legs";
     }
	public void Head(){
		System.out.println("Eyes");
	}
	public static void main(String str[]){
		Head h = new Head("Fingers",9999);
		h.Head();
		System.out.println(h);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Head [name=" + name + "]";
	}
}