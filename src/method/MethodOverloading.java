package method;

public class MethodOverloading {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {  // method name replace then attributes will not be affected
		System.out.println(a - b);
	}

	public void add(int a, int b, int c, float d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(2, 4, 6, 12.8f);
	}

}
