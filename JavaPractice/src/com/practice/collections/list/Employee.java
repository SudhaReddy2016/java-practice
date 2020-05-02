/**
 * 
 */
package com.practice.collections.list;

/**
 * @author 91988
 *
 */
public class Employee implements Comparable<Employee>{

	private String name;
	private String lName;
	private int salary;
	
	/**
	 * @param name
	 * @param lName
	 * @param salary
	 */
	public Employee() {
		super();
	}
	
	/**
	 * @param name
	 * @param lName
	 * @param salary
	 */
	public Employee(String name, String lName, int salary) {
		super();
		this.name = name;
		this.lName = lName;
		this.salary = salary;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", lName=" + lName + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
//		if(o.getlName().compareTo(this.getlName()) == -1) {
//			return -1;
//		} else if(o.getlName().compareTo(this.getlName()) == 1) {
//			return 1;
//		}  else if(o.getlName().compareTo(this.getlName()) == 0) {
//			return o.getSalary() - this.getSalary();
//		}
		
		if(this.getlName().compareTo(o.getlName()) == 0){
			return this.getSalary() - o.getSalary();
		} 
		return this.getlName().compareTo(o.getlName());
	}
	
}
