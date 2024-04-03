package Input;

public class StaticVariable {

	static String  bankname="STATE BANK";				//static variable which apply for all over the objects in class
	String firstname;						//use different values for every object(means having unique values for every object)
	String lastname;
	
	public static void main(String[] args) {
		int age=22;						//local variable which execute up to only particular method we need to inisilize the values
		StaticVariable obj=new StaticVariable();
		obj.firstname="Pillamgolla";
		obj.lastname="Akhil";
		System.out.println(obj.firstname+" "+obj.lastname);		//output:Pillamgolla Akhil and 22
		System.out.println(age);
		System.out.println(bankname);
		
		
	}

}

