package asList;

import java.util.Arrays;
import java.util.List;

public class asList {

	 // Main driver method
    public static void main(String[] argv) throws Exception
    {
        // Try block to check for exceptions
        try {
 
            // Creating Arrays of Integer type
            Integer a[] = new Integer[] { 10, 20, 30, 40 };
 
            
            List<Integer> list = Arrays.asList(a);              // Array ->  List using as list method
 
            
            System.out.println("The list is: " + list);        // Printing all the elements inside list object
        }
 
        // Catch block to handle exceptions
        catch (NullPointerException e) {
 
            // Print statements	
            System.out.println("Exception thrown : " + e);
        }
    }
}
