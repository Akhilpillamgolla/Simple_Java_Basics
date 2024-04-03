package staticNonstatic;

public class NonStatic {

/*	int a;
	NonStatic(){                                  // Constructor  
		System.out.println("inside constructor");// Access non static  using class name();
	}
	{
		System.out.println("non staticBlock");
		new NonStatic();
	}
	public static void main(String[] args) {
		System.out.println("main Method");
	}
	static {
		System.out.println("Static Block");
	}  
}
*/	
/*	int x=25;                  // 2.non static object reference
	NonStatic(){              //for object creation we need 
	

}
	public static void main(String[] args) {
		NonStatic ord = new NonStatic();
		System.out.println(ord.x);
	    new NonStatic(); 
	}
} */
	
/*	int x;
	NonStatic(){					//3.this referes to the current object

		System.out.println(this);			//this refers to nonstatic and gaves address of that nonstatic
		System.out.println(this.x);			//use this only in nonstatic block or method //this.x . will link the method
	}

	public static void main(String[] args) {
		new NonStatic();

	}

}*/

	int a=90;                               //4.Calling Non static method
	NonStatic(){                                  
		System.out.println("constructor");
		System.out.println(this.a);
	}
	{
		System.out.println("non static");
	}
				
	public static void main(String[] args) {				//creating new object to call nonstatic method
		NonStatic obj=new NonStatic();
		obj.method1();							//call nonstatic method only in main method
	}
	void method1() {
		System.out.println("static method");
	}
	

}
