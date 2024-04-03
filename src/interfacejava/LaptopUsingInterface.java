package interfacejava;

public interface LaptopUsingInterface {

	public void copy() ;   // method creation in interface (in class we will add  have {})

	public void cut() ;    //  this has only what to do 
	
	public void paste() ;  // this is about how to do
	
	public void keyboard();
	
	default void security() {            // not manditory in all class (java 8 feature) # object creation is must
		System.out.println("Please Implement");  // To use this we must use Overide Keyword
		commoncode();
	}
	
	static void camera() {             // not manditory in all class (java 8 feature) # object creation not needed. directly accessed by interface name 
		System.out.println("Camera is not manditory");
		Commoncode();
	}
	
	private void commoncode() {          //used for code re-usability (by calling in default method)(non static method)
		System.out.println("CommonCode");
	}
	
	private static void Commoncode() {     //(called by static method)
		System.out.println("CommonCOdeUsingStatic");
	}
}

