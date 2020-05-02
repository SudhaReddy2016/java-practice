package com.practice.collections.list;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayListElements {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Creams> lt = new ArrayList<Creams>();
		
		Creams c1 = new Creams();
		c1.setName("Icecream");
		c1.setNumber(34526);
		lt.add(c1);
		
		Creams c2 = new Creams();
		c2.setName("Icecream");
		c2.setNumber(34526);
		lt.add(c2);
		
		Creams c3 = new Creams();
		c3.setName("Vennela");
		c3.setNumber(865623);
		lt.add(c3);
		
		Creams c4 = new Creams();
		c4.setName("Chocolate");
		c4.setNumber(9863);
		lt.add(c4);
		
		Creams c11 = new Creams();
		c11.setName("Icecream");
		c11.setNumber(34526);
		lt.add(c11);
		
		for(int i=0;i<lt.size();i++){
			for(int j=i+1;j<lt.size();j++){
				if(lt.get(i).equals(lt.get(j))){
					lt.remove(j);
					j--;
				}
			}
		}
		System.out.println("remove:"+lt);
		
		//System.out.println(lt.toString());
		/*Set<Creams> ws = new  LinkedHashSet<Creams>(lt);
		System.out.println(ws);
		*/
		
	}

}
