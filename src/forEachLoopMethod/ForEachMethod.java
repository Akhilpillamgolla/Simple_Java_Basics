package forEachLoopMethod;
import java.util.*;
public class ForEachMethod {
	
	public static void main(String[] args) {
		 ArrayList<String> students = new ArrayList<String>();
		  
	        
	        students.add("Akhil");
	        students.add("Indu");
	        students.add("Mani");
	        students.add("Manu");
	  
	        
	        System.out.println("list of Students:");
	  
	        students.forEach((n) -> print(n));     // n will save the Names of people 
	    }
	  
	    
	    public static void print(String n)         
	    {
	        System.out.println("Student Name is " + n);     // printing student name
	    }
	  
	
       
}   
       

