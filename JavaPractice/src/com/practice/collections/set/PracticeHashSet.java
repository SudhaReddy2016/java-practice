package com.practice.collections.set;

import java.util.HashSet;
import java.util.Set;

public class PracticeHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Parts> s = new HashSet<Parts>();
		
		Parts p1 = new Parts();
		p1.setName("Eyes");
		p1.setNumbers(3456);
		s.add(p1);
		
		Parts p2 = new Parts();
		p2.setName("Nose");
		p2.setNumbers(7895);
		s.add(p2);
		
		Parts p3 = new Parts();
		p3.setName("Ears");
		p3.setNumbers(7654);
		s.add(p3);
		
		for(Parts p:s){
			System.out.println(p);
		}
		
		Set<Parts> s1 = new HashSet<Parts>();
		
		Parts p4 = new Parts();
		p4.setName("Neck");
		p4.setNumbers(34556);
		s1.add(p4);
		
		Parts p5 = new Parts();
		p5.setName("Fingers");
		p5.setNumbers(36678);
		s1.add(p5);
		
		Parts p6 = new Parts();
		p6.setName("Hands");
		p6.setNumbers(82335);
		s1.add(p6);
		
		for(Parts pa:s1){
			System.out.println(pa);
		}
		
		s.addAll(s1);
		System.out.println(s.add(p5));
		System.out.println(s.contains(p2)); 
		System.out.println(s.containsAll(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s.isEmpty());
		System.out.println(s.remove(p6));
		System.out.println(s.toString());
		System.out.println(s.size());
		System.out.println(s.getClass());
		System.out.println(s.iterator());
		System.out.println(s.toArray());
		System.out.println(s.retainAll(s1));
		System.out.println(s.removeAll(s1));
		System.out.println(s.size());
		

	}

}
