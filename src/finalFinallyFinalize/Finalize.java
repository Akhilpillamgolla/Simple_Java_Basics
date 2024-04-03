package finalFinallyFinalize;

public class Finalize {

	public static void main(String[] args) {

		Finalize obj = new Finalize();        
        // printing the Hash Code   
        System.out.println("Hashcode is: " + obj.hashCode());           
        obj = null;    
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection");     
    }     
   // defining the finalize method   
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");   
        System.out.println("Cleaning activity is done to object just before Destruction");
    }     
	}


