package com.practice.collections.list;

import java.util.Vector;

public class PracticeVector {
	
	public static void main(String str[]){
		
		Vector<Books> v = new Vector<Books>();
		
		Books b1 = new Books();
		b1.setName("TextBooks");
		b1.setNumber(908);
		v.add(b1);
		
		Books b2 = new Books();
		b2.setName("NoteBooks");
		b2.setNumber(765);
		v.add(b2);
		
		Books b3 = new Books();
		b3.setName("Materials");
		b3.setNumber(543);
		v.add(b3);
		
		for(Books b:v){
			System.out.println(b); 
		}
		
		Vector<Books> v1 = new Vector<Books>();
		
		
		Books b4 = new Books();
		b4.setName("Bindingbooks");
		b4.setNumber(321);
		v1.add(b4);
		
		Books b5 = new Books();
		b5.setName("Rulednotebooks");
		b5.setNumber(456);
		v1.add(b5);
		
		for(Books b0:v1){
			System.out.println(b0); 
		}
		
		v.addAll(v1);
		System.out.println(v.capacity());
		System.out.println(v.contains(b4));
		System.out.println(v.clone());
		System.out.println(v.equals(v1));
		System.out.println(v.contains(b5));
		System.out.println(v.containsAll(v1));
		System.out.println(v.hashCode());
		System.out.println(v.indexOf(b2));
		System.out.println(v.indexOf(b2, 2));
		System.out.println(v.toString());
		System.out.println(v.remove(b1));
		//System.out.println(v.get(b2));
		System.out.println(v.iterator());
		System.out.println(v.firstElement());
		System.out.println(v.getClass());
		System.out.println(v.listIterator());
		System.out.println(v.lastElement());
		System.out.println(v.removeAll(v1));
		
	}

}
