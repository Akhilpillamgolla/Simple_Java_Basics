package method;

public class method {
	static int Balance =4000;                    // class variable 
	public static void greeting() {
		System.out.println("hello akhi how are you");
	}
	
	public void deposit(int amount) {         // int amount is Parameter // for non static we don't need to mention anything(like static)
		Balance = Balance + amount;
		System.out.println("amount is deposited successfully ");
	}
	
	public static void withdrawal(int amount) {
		Balance = Balance - amount;	
		System.out.println("amount is Withdrawn successfully");
	}
	
	public int currentBalance() {            // as we return some thing we don't use void
		return Balance;
	}

	public static void main(String[] args) {         // if above method is not static we use object 
	greeting();       //  to execute above method we must call the above method in main method
	System.out.print("your account balance is ");
	System.out.println(Balance);
	method bank = new method();            
	bank.deposit(5000);
	System.out.print("Balance after deposit is  ");
	System.out.println(Balance);                  //Balance after deposit 
	method Bank = new method(); 
	Bank.withdrawal(100);
	System.out.println("Balance after withdrawal is  "+Balance);   //Balance after Withdrawal
	
}
}
