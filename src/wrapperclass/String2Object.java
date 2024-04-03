package wrapperclass;

public class String2Object {

	public static void main(String[] args) {

		long x = 1000;

		Long y = Long.valueOf(x);   //primitive -> wrapper Type 

		String s = y.toString();

		Long z = Long.valueOf(s);
		
		System.out.println(x);
		
		System.out.println(z);
		
		System.out.println(s);

	}

}
