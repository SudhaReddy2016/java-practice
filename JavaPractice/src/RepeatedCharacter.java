import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedCharacter {
	
	public static void main(String str[]){
		String s = "Bangalore";
		char[] c = s.toCharArray();
	
		
		Map<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<c.length;i++){
			
		if(hm.get(c[i])!=null){
			int p = hm.get(c[i]);
			p++;
			hm.put(c[i], p);
		}else
		{
			hm.put(c[i], 1);
		}
	}
		for(Map.Entry<Character, Integer> map:hm.entrySet())
		System.out.println(map.getKey() +" count: "+map.getValue());
}
}
