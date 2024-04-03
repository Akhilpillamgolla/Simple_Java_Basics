package forEachLoopMethod;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		
		System.out.println("List Of students :");
		
		String[] Developers = {"Akhil", "Indu", "Mani", "Manu"};
		
//		System.out.println(Developers);
		
		for (String i : Developers) {
		  System.out.println("Studens Name is "+i);
	}
//		
		
	}
       //	 This part Don't work 
//	  public static void print(String i) { 
//	  System.out.println("Student Name is " +i); // printing student name }
}  
 