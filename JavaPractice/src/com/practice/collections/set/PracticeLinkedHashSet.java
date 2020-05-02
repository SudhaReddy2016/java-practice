package com.practice.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeLinkedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<InnerParts> sip = new LinkedHashSet<InnerParts>();
		
		InnerParts ip1 = new InnerParts();
		ip1.setName("Heart");
		ip1.setNumber(123);
		sip.add(ip1);
		
		InnerParts ip2 = new InnerParts();
		ip2.setName("Lungs");
		ip2.setNumber(456);
		sip.add(ip2);
		
		for(InnerParts ipa:sip){
			System.out.println(ipa);
		}
		
		
		Set<InnerParts> sip1 = new LinkedHashSet<InnerParts>();
		InnerParts ip3 = new InnerParts();
		ip3.setName("Kidneys");
		ip3.setNumber(123);
		sip1.add(ip3);
		
		InnerParts ip4 = new InnerParts();
		ip4.setName("Brain");
		ip4.setNumber(123);
		sip1.add(ip4);
		
		for(InnerParts inpa:sip1){
			System.out.println(inpa);
		}
		sip.addAll(sip1);
		System.out.println(sip.add(ip2));
		System.out.println(sip.contains(sip1)); 
		System.out.println(sip.containsAll(sip1));
		System.out.println(sip.equals(sip1));
		System.out.println(sip.hashCode());
		System.out.println(sip.isEmpty());
		System.out.println(sip.remove(ip2));
		System.out.println(sip.toString());
		System.out.println(sip.size());
		System.out.println(sip.getClass());
		System.out.println(sip.iterator());
		System.out.println(sip.toArray());
		System.out.println(sip.retainAll(sip1));
		System.out.println(sip.removeAll(sip1));
		System.out.println(sip.size());

	}

}
