package staticNonstatic;

public class Static {
	
/* public static void main(String[] args) {		//main method
	
		System.out.println("Akhil");
		Static.method1();				//we need to call static method to print else it will not print static method

	}
	static {
		System.out.println(" Before Main Method");		//static block  
		Static.method1(); 				//calling static method inside static block
	}
	static void method1() {
		System.out.println(" Before & After Main Method");		//  static method
	}
}*/

	
 static int Bond=007;			//static variable

	public static void main(String[] args) {
		System.out.println("Akhil");
		Static.method1();
		System.out.println(Bond);			//System.out.println(helloworld.a); can call using class name

	}
	static {
		System.out.println("First");
		Static.method1(); 
		System.out.println(Bond);			//we can call static variable in static block also
	}
	static void method1() {
		System.out.println("Before & After Main");
	}
}
