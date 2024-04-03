package abstractClass;

public abstract class Lenovo implements LaptopInterface {         //abstract  for not complete implementation in class

	public void copy() {
		System.out.println("copy code");
	}
	
	public void cut() {
		System.out.println("cut method");
	}
	
}
