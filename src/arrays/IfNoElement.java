package arrays;

public class IfNoElement {

	public static void main(String[] args) {

		float arr1[] = new float [4];     //size can be integer , byte short 
		
		for (float f : arr1) {
			System.out.println(f);
		}
				
				
        float arr[] = {};
		
		for (float elements : arr) {
			
			System.out.println(elements);   // printing with forEachLoop
			
		}
	}

}
