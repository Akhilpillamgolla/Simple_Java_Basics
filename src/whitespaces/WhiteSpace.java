package whitespaces;

public class WhiteSpace {
	
	public static void main(String[] args) {
		
		String str = "Ak hil Pillam golla ";
		
		System.out.println(str);
		
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
