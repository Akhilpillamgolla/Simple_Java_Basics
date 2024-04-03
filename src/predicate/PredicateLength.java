package predicate;

import java.util.function.Predicate;

public class PredicateLength {

	public static void main(String[] args) {
		
		Predicate<String> p1=s->s.length()>5;

		System.out.println(p1.test("True mowa")); 
		
		Predicate<String> p2=s->s.length()<5;    // FALSE Mowa  < 5
 
		
        System.out.println();
		System.out.println(p2.test("FALSE Mowa"));  // s -> FALSE Mowa
		
		
	}

}
