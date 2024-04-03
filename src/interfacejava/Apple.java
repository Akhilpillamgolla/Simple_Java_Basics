package interfacejava;

public class Apple implements LaptopUsingInterface {
	@Override                                 //not manditory 
	public void copy() {
		System.out.println("Apple  COpy code");		
	}

	public void cut() {
		System.out.println("Apple  Cut code");		
	}

	@Override
	public void paste() {
		System.out.println("Apple  Paste code");		
	}

	@Override
	public void keyboard() {
		System.out.println("Apple  keyboard  code");		
	}
	
	public void retinadisplay() {
		System.out.println("Apple display type");                //not there in interface
	}

}
