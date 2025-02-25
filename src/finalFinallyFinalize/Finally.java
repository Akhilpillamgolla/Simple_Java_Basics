package finalFinallyFinalize;

public class Finally {

	public static void main(String[] args) {
		 try {    
		        System.out.println("Inside try block");  
		      // below code throws divide by zero exception  
		       int data=25/0;    
		       System.out.println(data);    
		      }   
		      // handles the Arithmetic Exception / Divide by zero exception  
		      catch (ArithmeticException e){  
		        System.out.println("Exception handled");  
		        System.out.println(e);  
		      }   
		      // executes regardless of exception occurred or not   
		      finally {  
		        System.out.println("finally block is always executed"); 
		        System.out.println("Executes even if there is no catch Block");
		        System.out.println("Executes even if exception Occur");
		      }    
	}
}
