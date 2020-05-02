package com.practice.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class PracticeTreeMap {
	
	public static void main(String str[]){
		
		Map<String,Number> d = new TreeMap<String,Number>();
		
		d.put("Whatsapp", 111);
		d.put("Facebook", 222);
		d.put("Instagram", 333);
		d.put("Telegram", 444);
		
		Map<String,Number> d2 = new TreeMap<String,Number>();
		d2.put("Youtube", 555);
		d2.put("Hike", 666);
		d2.put("Messenger", 777);
		
		d.putAll(d2);
		System.out.println(d.containsKey("Whatsapp"));
		System.out.println(d.containsValue(444));
		System.out.println(d.equals(d2));
		System.out.println(d.hashCode());
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d.toString());
		System.out.println(d.get("Telegram"));
		System.out.println(d.getClass());
		System.out.println(d.keySet());
		System.out.println(d.values());
		System.out.println(d.put("Share", 8));
		System.out.println(d.remove("Telegram"));
		System.out.println(d.entrySet());
	}

}
