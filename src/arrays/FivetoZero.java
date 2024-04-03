package arrays;

public class FivetoZero {

	
	public static void main(String[] args) { 
	int a[] = { 3, 4, 6, 3, 5, 7 };
	for (int i = 0; i < a.length; i++) {
	if (a[i]==3 && a[i + 1] == 5) { //checking 3 is beside 5 or not
        	a [i + 1] = 0;        //if 5 it return Zero
	}
	}
	for (int i : a) {
	System.out.println(i);
	}
	}
}
