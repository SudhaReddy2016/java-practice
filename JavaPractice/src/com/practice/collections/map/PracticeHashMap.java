package com.practice.collections.map;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Number> m= new HashMap<String,Number>();
		m.put("Dhana", 2);
		m.put("Dhanush",1);
		m.put("Sudha", 4);
		m.put("Nandini", 3);
		

		Map<String,Number> m1= new HashMap<String,Number>();
		m1.put("Naveen", 5);
		m1.put("Pinky",6);
		m1.put("Bujji", 7);
		m1.put("Nani",8);
		
		m.putAll(m1);
		System.out.println(m.containsKey("Naveen"));
		System.out.println(m.containsValue(1));
		System.out.println(m.equals(m1));
		System.out.println(m.hashCode());
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.toString());
		System.out.println(m.entrySet());
		System.out.println(m.get("Dhanush"));
		System.out.println(m.getClass());
		System.out.println(m.keySet());
		System.out.println(m.remove("Bujji"));
		System.out.println(m.values());
		
	
	}

}
