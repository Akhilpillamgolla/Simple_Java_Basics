package interfacejava;

public class Dell implements LaptopUsingInterface{
	@Override                                 //not manditory 
	public void copy() {
		System.out.println("Dell  COpy code");		
	}

	public void cut() {
		System.out.println("Dell  Cut code");		
	}

	@Override
	public void paste() {
		System.out.println("Dell  Paste code");		
	}

	@Override
	public void keyboard() {
		System.out.println("Dell  keyboard  code");		
	}
	
	public void OLEDdisplay() {                            //not there in code
		System.out.println("Dell display type");
	}

	public void Charger() {
		System.out.println("Charger is main");
	}
}
