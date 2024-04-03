package flowControl;

public class TransferStatment {

	public static void main(String[] args) {
		/*for (int i=1;i<=20;i++) {
			if (i==12) {
				break;                           // break means stop execution & also used in Switch 
			}else {
				System.out.println(i);
			}
		}*/
		
		int i = 0;
		while (i < 10) {
		  if (i == 4) {                        // continue  mean emit only that value  
		    i++;                               //unconditional jump stmt Break & Continue 
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
	}

}


