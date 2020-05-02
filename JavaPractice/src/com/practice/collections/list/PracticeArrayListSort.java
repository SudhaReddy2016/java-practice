/**
 * 
 */
package com.practice.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 91988
 *
 */
public class PracticeArrayListSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e5 = new Employee();
		e5.setName("Name9");
		e5.setlName("LName9");
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
		
		Employee e55 = new Employee();
		e55.setName("Name5");
		e55.setlName("LName5");
		e55.setSalary(16);
		
		Employee e2 = new Employee();
		e2.setName("Name1");
		e2.setlName("LName1");
		e2.setSalary(10);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e5);
		list.add(e3);
		list.add(e7);
		list.add(e6);
		list.add(e1);
		list.add(e2);
		list.add(e55);
		
		for(Employee entry : list) {
			System.out.println(entry);
		}
		
		Collections.sort(list);
		
		System.out.println("After sort");
		for(Employee entry : list) {
			System.out.println(entry);
		}
		
		Collections.sort(list, new EmployeeComparatorSortOnSalary());
		System.out.println("After sort - Salary" );
		for(Employee entry : list) {
			System.out.println(entry);
		}
		
		Collections.sort(list, new EmployeeComparatorSortOnLName());
		System.out.println("After sort - LName");
		for(Employee entry : list) {
			System.out.println(entry);
		}
	}

}
