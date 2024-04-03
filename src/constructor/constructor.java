
package constructor;

public class constructor {
	public int i;
	public static void main(String[] args) {

		constructor var = new constructor(21); // class variable = keyword constructor (a value)
			System.out.println(var.i);        // print o if below constructor are not created  
	}

	public constructor( ) { // default constructor (we don't have return type )
	 i = 10;	// its explicit as its created by us else implicit  (if this line & no pharam value - then it print 10)
	 System.out.println(i);
	}

	public constructor(int a ) {
		i = a;
		System.out.println(a);
	}             	
}
