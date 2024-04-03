package wrapperclass;

public class Primitive2Object {

	public static void main(String[] args) {

		int x = 500;
		Integer y = Integer.valueOf(x); // int y is local reference / value of - static method takes int & return Object
		int z = y.intValue(); // converting to primitive again (intValue is non static method as we used
								// object reference to call that method)

	}

}
