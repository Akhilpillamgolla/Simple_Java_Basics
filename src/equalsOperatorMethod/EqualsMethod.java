package equalsOperatorMethod;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
        
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        
        System.out.println("content comparison(Compare actual values in object)");
        
        System.out.println("OverRiding - Done");
        
        System.out.println("comparison of values in the objects");
	}
}
