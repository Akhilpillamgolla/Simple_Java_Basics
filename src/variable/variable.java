package variable;

public class variable {

	
//	  int id = 150;                         //Instance Variable(Non Static feild)
//	  String Name ="akhil Pillamgolla"; 
//	  public static void main(String[] args) {
//   variable var = new variable();          // Can't access directly (System.out.println(id);)
//	  System.out.println(var.id);          //can be accessed using object
//	  System.out.println(var.Name); //variable name = new variable();  (new variable().Name) or (var.name)
//	  
	  
	
//	  static int id = 140; // 2.class variable (that class can me accessed by many methods) 
//	  static String name = "akhil Pillamgolla"; 
//	  public static void main(String[] args) { 
//	  System.out.println(id); //no need of object creation for int
//	  System.out.println(name); 

	
	
//	  public static void main(String[] args) {       //3.local variable(variable inside a method)   
//		  int id = 120;                               //can't be accessed in another method }
//       System.out.println(id);
	  

	
	public static void main(String[] args) {           //4. args parameter 
		int height = 120; 
	  System.out.println(height);
	  test(10); 
	  }

	public static void test(int height)
	{ 
		System.out.println(height);              // value is taken from main method }
	 
}
}