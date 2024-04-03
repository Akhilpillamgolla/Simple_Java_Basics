package predicate;

import java.util.function.Predicate;

public class PredicateJoiningOr {     // it will combine both output (NO duplicates & no i/p values that are not present in o/p) 
	
public static void main(String[] args) {
		
		int x[] = {1,2,3,4,5,6};         //array creation
		Predicate<Integer>p1=I->I%2==0;
		
		Predicate<Integer>p2=I->I>2;
		
		System.out.println("Print all Even Numbers:");
		m1(p1,x);
		
		System.out.println("Print all Greater then 2 :");
		m1(p2,x);
		
		System.out.println("Print all Greater then 2 or even :");
		m1(p2.or(p1),x);
		
	}

	private static void m1(Predicate<Integer> p, int[] x) {  //input - predicate o/p & array

		{
			for (int i : x) {
				if(p.test(i))
					System.out.println(i);
				
			}
		}

}
}