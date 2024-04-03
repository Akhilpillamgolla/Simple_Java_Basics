package arrays;

public class CharCheck {

	public static void main(String[] args) {
		
		char c[] = { 'a', 'z', 'q', 'p', 'a' };      // check first & last elements are same 
		if (c[0] == c[c.length - 1]) {   //c.length -1 is last element
			System.out.println("First and Last elements are same");
		} else {
			System.out.println("They are different");
		}
	}

}
