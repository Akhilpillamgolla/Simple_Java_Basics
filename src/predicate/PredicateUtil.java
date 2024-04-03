package predicate;

import java.util.function.Predicate;

public class PredicateUtil {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p=I->I>50;      // <DATA TYPE> 100 > 50 -> true 
		
		System.out.println("The Game is Changing ");
		System.out.println("I think its true : "+p.test(100));  // I =  100
		
		System.out.println(p.test(49)); // I = 49 False 
		
		
	}

}
