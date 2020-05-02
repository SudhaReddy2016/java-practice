package com.practice.basics.datatypes.primitive;

public class PracticeDataTypesDefault {

	public String str;
	public int i;
	public short s;
	public long l;
	public double d;
	public float f;
	public boolean b;
	public char c;
	public byte by;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeDataTypesDefault ptd = new PracticeDataTypesDefault();
		System.out.println(ptd);

	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticeDataTypesDefault [str=" + str + ", i=" + i + ", s=" + s
				+ ", l=" + l + ", d=" + d + ", f=" + f + ", b=" + b + ", c="
				+ c + ",by="+by+"]";
	
	}
}
