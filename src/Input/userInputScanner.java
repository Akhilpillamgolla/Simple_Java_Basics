package Input;

import java.util.*;

public class userInputScanner {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);           // system.in - read the data
		System.out.println("what is your name?");  
		String Name = input.nextLine();                       // used to store String values
		System.out.printf("Hello %s, How are u?\n", Name);   // print f for string & /n or %n for next line
		String status = input.nextLine();
		System.out.printf("Thank u for info, uer age", status);
		int Age = input.nextInt();
		System.out.printf("So young only  %d years,what is uer salary ", Age);
		float salary = input.nextFloat();
		System.out.printf("%f Thats huge, ", salary);
		input.close();                                    // to avoid resource leakage error

	}

}