package com.practice.collections.list;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList {
	public static void main(String str[]){
		
		List<Mobiles> list=new ArrayList<Mobiles>();
		List<Integer> l=new ArrayList();
		Mobiles m1 = new Mobiles();
		m1.setName("Lenovo");
		m1.setNumber(12345);
		list.add(m1);
		
		Mobiles m2 = new Mobiles();
		m2.setName("Oppo");
		m2.setNumber(45678);
		list.add(m2);
		
		Mobiles m3 = new Mobiles();
		m3.setName("Vivo");
		m3.setNumber(78906);
		list.add(m3);
		StringBuffer bf=new StringBuffer();
		for(int k=0;k<list.size();k++){
			
			if(list.get(k)!=null){
				String strw=list.get(k).getName();
				if(strw=="Vivo"){
					System.out.println("Testn*****"+strw);
				}
			}
		//	System.out.println(list.get(k).getName());
		//	bf.append(list.get(k).getName()+":");
		}
		for(Mobiles m:list){
			System.out.println(m);
		}
		
		for(int i=0;i<3;i++){
			System.out.println(i);
			Mobiles m = list.get(i);
			System.out.println(m.getName());
		}
		
		List<Mobiles> list1=new ArrayList<Mobiles>();
		
		Mobiles m4 = new Mobiles();
		m4.setName("Redmi");
		m4.setNumber(77706);
		list1.add(m4);
		
		Mobiles m5= new Mobiles();
		m5.setName("Mi");
		m5.setNumber(78906);
		list1.add(m5);
		

		for(Mobiles m:list1){
			System.out.println(m);
		}
		list.addAll(list1);
		System.out.println("size:"+list.size());
		System.out.println("contains:"+list.contains(m5));
		System.out.println("containsall:"+list.containsAll(list1));
		System.out.println("equals:"+list.equals(list1));
		System.out.println("hashcode:"+list.hashCode());
		System.out.println("indexof:"+list.indexOf(m3));
		System.out.println("isempty:"+list.isEmpty());
		System.out.println("remove:"+list.remove(m4));
		System.out.println("retainall:"+list.retainAll(list1));
		System.out.println("tostring:"+list.toString());
		System.out.println("get:"+list.get(0));
		System.out.println("getclass:"+list.getClass());
		System.out.println("iterator:"+list.iterator());
		System.out.println("toarray:"+list.toArray());
		System.out.println("addall:"+list.addAll(list));
		System.out.println("size:"+list.size());
		System.out.println("sublist:"+list.subList(1, 2));
		
	}

}
