package com.practice.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class PracticeTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<SetUpBox> ts = new TreeSet<SetUpBox>();
		
		SetUpBox sub1 = new SetUpBox();
		sub1.setName("dishtv");
		sub1.setNumber(1235);
		ts.add(sub1);
		
		SetUpBox sub2 = new SetUpBox();
		sub2.setName("sundirect");
		sub2.setNumber(54673);
		ts.add(sub2);
		
		
		for(SetUpBox sb:ts){
			System.out.println(sb);
		}
		
		Set<SetUpBox> ts1 = new TreeSet<SetUpBox>();
		
		SetUpBox sub3= new SetUpBox();
		sub3.setName("airtel");
		sub3.setNumber(2345);
		ts1.add(sub3);
		
		SetUpBox sub4= new SetUpBox();
		sub4.setName("tatasky");
		sub4.setNumber(98647);
		ts1.add(sub4);
		
		for(SetUpBox sb1:ts){
			System.out.println(sb1);
		}
		
		ts.addAll(ts1);
		System.out.println(ts.addAll(ts1));
		System.out.println(ts.contains(sub3)); 
		System.out.println(ts.containsAll(ts1));
		System.out.println(ts.equals(ts1));
		System.out.println(ts.hashCode());
		System.out.println(ts.isEmpty());
		System.out.println(ts.remove(sub2));
		System.out.println(ts.toString());
		System.out.println(ts.size());
		System.out.println(ts.getClass());
		System.out.println(ts.iterator());
		System.out.println(ts.toArray());
		System.out.println(ts.retainAll(ts1));
		System.out.println(ts.removeAll(ts1));
		System.out.println(ts.size());
	}

}
