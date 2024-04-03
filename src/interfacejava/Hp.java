package interfacejava;

public class Hp implements LaptopUsingInterface{

	@Override                                 //not manditory 
	public void copy() {
		System.out.println("HP  COpy code");		
	}

	public void cut() {
		System.out.println("HP  Cut code");		
	}

	@Override
	public void paste() {
		System.out.println("HP  Paste code");		
	}

	@Override
	public void keyboard() {
		System.out.println("HP  keyboard  code");		
	}
	
	public void Oleddisplay() {
		System.out.println("Hp display type");
	}
	
	@Override
	public void security() { 
		System.out.println("HP security");
	}


}
