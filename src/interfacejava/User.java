package interfacejava;

public class User {

	public static void main(String[] args) {
		
		Hp lappy = new Hp(); // object creation 
		lappy.copy();
		lappy.Oleddisplay();
		lappy.security();
		
		
		Dell lapi = new Dell();
		lapi.OLEDdisplay();
		lapi.cut();             //until java 7 (what to do & not how to do )
		lapi.Charger();         
		
		LaptopUsingInterface.camera();    // we can access directly via  interface name
		
	}
}
