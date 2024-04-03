package flowControl;

public class conditionalStatment { // have maths,physic,chemistry if score minimum 35 in each then calculate avg
									// and find grade

	public static void main(String[] args) { // else print fail
//		int maths = 88, physic = 99, chemistry = 100;
//		if (maths >= 35 & physic >= 35 & chemistry >= 35) {
//			double avg = (maths + physic + chemistry) / 3;
//			if (avg > 35 & avg < 59) {
//				System.out.println("c grade");
//			} else if (avg >= 59 & avg < 69) {
//				System.out.println("b grade");
//			} else {
//				System.out.println("a grade");
//			}
//		} else {
//			System.out.println("failed");
//		}
		int x=2;                        //2.Switch
		switch(x) {
		case 1:						//here 1 is called as case label
			System.out.println("case 1");  // what ever we give in that x we get it 
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 2");
			break;
		case 4:
			System.out.println("case 4");
			break;
		default:
			System.out.println("noughting");
		} 
		
	}

}

