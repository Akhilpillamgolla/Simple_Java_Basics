package arrays;

public class Array {

	@SuppressWarnings("removal")    // for adding values using object  without warnings
	public static void main(String[] args) {

		int arr [] = {1,2,4,3};    // method 1 
		
		int arr1 [] = new int[6];    // method 2 where size is fixed 
		
		arr1[0] = 5;
		arr1[1] = 4;
		
		//arr1[2] = 3.4; other data type is not allowed 
		
		arr1[2] = new Integer(3); // Auto bOxing (Wrapper Class) 
		arr1[3] = new Integer(5); // Auto bOxing (Wrapper Class) 
		arr1[1] = new Integer(1); // Auto bOxing (Wrapper Class)  //updated value
		
		
		System.out.println(" Elements in array 1 ");
		
		System.out.println(arr);     // print object details 

		
		
		for (int i = 0; i < arr.length; i++) { 
			System.out.println(arr[i]);
		}
		 	
		System.out.println("Elements in array 2");
		
		System.out.println(arr1[2]);     //printing using index number
		
		for (int i = 0; i < arr1.length; i++) { 
			System.out.println(arr1[i]);
		}
		
		System.out.println("If you add more elements than Specified then you will get array out of bound Exception");
		
	}

}
