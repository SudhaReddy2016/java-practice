/**
 * 
 */
package com.practice.collections.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author 91988
 *
 */
public class PracticeTreeMapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e5 = new Employee();
		e5.setName("Name5");
		e5.setlName("LName5");
		e5.setSalary(15);
		
		Employee e3 = new Employee();
		e3.setName("Name3");
		e3.setlName("LName3");
		e3.setSalary(13);
		
		Employee e7 = new Employee();
		e7.setName("Name7");
		e7.setlName("LName7");
		e7.setSalary(17);
		
		Employee e6 = new Employee();
		e6.setName("Name6");
		e6.setlName("LName6");
		e6.setSalary(16);
		
		Employee e1 = new Employee();
		e1.setName("Name2");
		e1.setlName("LName2");
		e1.setSalary(12);
		
		Employee e2 = new Employee();
		e2.setName("Name1");
		e2.setlName("LName1");
		e2.setSalary(10);
		
//		Map<Employee, String> map = new HashMap<Employee, String>();
		Map<Employee, String> map = new TreeMap<Employee, String>();
		map.put(e1, "Name2");
		map.put(e2, "Name1");
		map.put(e5, "Name5");
		map.put(e3, "Name3");
		map.put(e7, "Name7");
		map.put(e6, "Name6");
		
		for(Entry<Employee, String> entry : map.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
		}
		
	}

}
