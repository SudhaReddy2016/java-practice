class Person
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;

		if(this.name.equals(other.name))
			return true;
		else
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
*/		return false;
	}
	
}
public class EquelsTest {

	public static void main(String[] args) {
		Person p1= new Person();
		p1.setName("Sravanti");
		Person p2= new Person();
		p2.setName("sudha");
		Person p3= new Person();
		p3.setName("Sravanti");
		String s="sravanthi";
		String s1="sravanthi";
		System.out.println(s.equals(s1));
		System.out.println(p1.equals(p3));
		
		String sr="abc";
		String srv="abc";
		String sr1=new String("abc");
		System.out.println(sr==sr1);
		

	}

}
