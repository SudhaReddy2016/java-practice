import java.nio.charset.StandardCharsets;

public class SortingString {

	public static void main(String[] args) {
		String str = "subbareddy";
		byte[] byt = str.getBytes();

		System.out.println(str);
		 for(int i=0;i<byt.length-1;i++){
		 for(int j=0;j<byt.length-1;j++){
		 if(byt[j]>byt[j+1]){
		 byte temp=byt[j+1];
		 byt[j+1]=byt[j];
		 byt[j]=temp;
		 }
		 }
		 }
//		byte[] sort = new byte[str.length()];
//		for (int i = 0; i < byt.length - 1; i++) {
//			int k = 0;
//			for (int j = 0; j < byt.length - 1; j++) {
//			
//				if (byt[i] > byt[j]) {
//					k++;
//				}
//				
//			}
//			sort[k] = byt[i];
//		}

		String str1 = new String(byt, StandardCharsets.UTF_8);
		System.out.println(str1);

	}

}
