
public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Naveen";
		char[] c = s.toCharArray();
		StringBuffer sb=new StringBuffer();
		sb.append("Test");
		System.out.println(sb.reverse());
		for(int i = s.length()-1;i>=0;i--){
			System.out.print(c[i]);
		}

	}

}
