/**
 * 
 */
package com.practice.collections.list;

import java.util.Comparator;

/**
 * @author 91988
 *
 */
public class EmployeeComparatorSortOnSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary() - o2.getSalary();
	}
	
}
