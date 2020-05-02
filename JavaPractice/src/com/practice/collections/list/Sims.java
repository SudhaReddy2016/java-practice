package com.practice.collections.list;

//import org.omg.CORBA.Object;

public class Sims {
	
	private String name;
	private int number;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sims [name=" + name + ", number=" + number + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
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
		Sims other = (Sims) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
}

//	public int hashcode(){
//		final int prime = 31;
//		int result = 1;
//		result = prime*result+((name==null)? 0 :name.hashCode())
//		result = prime*result+number;		
//		return result;
//	}
//    public boolean equals(Object obj){
//    	if(this == obj )
//    		return true;
//    	if(obj == null)
//    		return false;
//    	if(getClass() != obj.getClass())
//    		return false;
//    	Sims other = (Sims) obj;
//    	if(name == null){
//    		if( other.name != null)
//    			return false;
//    		}
//    		else if(!name .equals(other.name))
//    		return false;
//    		if(number != other.number)
//    			return false;
//		return true;
//    }
//    public String tostring(){
//    	return "Sims(name="+name+" number = "+number+")";
//    }
//}
//
