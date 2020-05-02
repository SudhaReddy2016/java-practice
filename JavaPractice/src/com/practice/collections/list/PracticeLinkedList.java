package com.practice.collections.list;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PracticeLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Sims> ll = new LinkedList<Sims>();
		
		Sims s1 = new Sims();
		s1.setName("Idea");
		s1.setNumber(9666);
		ll.add(s1);
			
		Sims s2 = new Sims();
		s2.setName("BSNL");
		s2.setNumber(81860);
		ll.add(s2);
			
		Sims s3 = new Sims();
		s3.setName("Voda");
		s3.setNumber(95815);
		ll.add(s3);
		
//
//		for(Sims s:ll){
//			System.out.println("s");
//		}
//		
			
		List<Sims> ll1 = new LinkedList<Sims>();
		
		Sims s4 = new Sims();
		s4.setName("Jio");
		s4.setName("82470");
		ll1.add(s4);
			
		Sims s5 = new Sims();
		s5.setName("Airtel");
		s5.setNumber(80083);
		ll1.add(s5);
			
		Sims s6 = new Sims();
		s6.setName("TATADOCOMO");
		s6.setNumber(81257);
		ll1.add(s6);
		for(Sims s:ll1){
			System.out.println(s);
		}
		ll.addAll(ll1);
		System.out.println(ll.addAll(ll1));
		System.out.println(ll.size());
		System.out.println(ll.equals(ll1));
		System.out.println(ll.hashCode());
		System.out.println(ll.indexOf(s5));
		System.out.println(ll.contains(s6));
		System.out.println(ll.containsAll(ll1));
		System.out.println(ll.lastIndexOf(s6));
		System.out.println(ll.isEmpty());
		System.out.println(ll.remove(s4));
		System.out.println(ll.toString());
		System.out.println(ll.get(0));
		System.out.println(ll.getClass());
		System.out.println(ll.set(0, s6));
		System.out.println(ll.toArray());
		System.out.println(ll.retainAll(ll1));
		System.out.println(ll.removeAll(ll1));
	}

}
