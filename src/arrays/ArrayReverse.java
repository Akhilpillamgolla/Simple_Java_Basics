package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ArrayReverse {

	public static void main(String[] args) {

		Integer arr[] = {9,2,11,24,5};
	
		for (int i : arr) {
			System.out.println(i);
		}
		
		
		
	 List<Integer> lst =  Arrays.asList(arr);
      Collections.reverse(lst);
      System.out.println(lst);	
      
      TreeSet<Integer> ts = new TreeSet();
      ts.addAll(Arrays.asList(arr));

  	 System.out.println(ts);
  	
  	 TreeSet<Integer> ts1 = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);
     ts1.addAll(ts);

 	System.out.println(ts1);
  	
  	
	}
	
	

}
