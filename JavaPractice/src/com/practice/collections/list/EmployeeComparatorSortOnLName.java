/**
 * 
 */
package com.practice.collections.list;

import java.util.Comparator;

/**
 * @author 91988
 *
 */
public class EmployeeComparatorSortOnLName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getlName().compareTo(o2.getlName());
	}
	
}
