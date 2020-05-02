package com.practice.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeLinkedHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Number> p = new LinkedHashMap<String,Number>();
		
		p.put("Bluepen", 1);
		p.put("Blackpen", 2);
		p.put("Redpen", 1);
		p.put("Greenpen", 1);
		
		Map<String,Number> p1 = new LinkedHashMap<String,Number>();
		p1.put("Pinkpen", 1);
		p1.put("yellowpen", 1);
		p1.put("orangepen", 1);
		
		p.putAll(p1);
		System.out.println(p.containsKey("Greenpen"));
		System.out.println(p.containsValue(1));
		System.out.println(p.equals(p1));
		System.out.println(p.hashCode());
		System.out.println(p.isEmpty());
		System.out.println(p.size());
		System.out.println(p.toString());
		System.out.println(p.entrySet());
		System.out.println(p.get("Blackpen"));
		System.out.println(p.getClass());
		System.out.println(p.keySet());
		System.out.println(p.remove("Orange"));
		System.out.println(p.values());
		
	}

}
