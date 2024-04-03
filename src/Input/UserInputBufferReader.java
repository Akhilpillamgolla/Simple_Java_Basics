package Input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UserInputBufferReader {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Enter Employee id ");
		
		int num = Integer.parseInt( br.readLine());
		
		System.out.println("Enter Employee Name ");
		
		String str = String.valueOf(br.readLine()); //readLine() - Reads a line of text
		
		System.out.println("Enter The Salary "); 
		
		float flt = Float.parseFloat(br.readLine()); //read() -Reads a single character.

		
		System.out.println("Enter The Cuttings ");
		
		double dbl = Double.parseDouble(br.readLine());
		
		
		System.out.println("Emplyee Id : "+num);
	
		System.out.println("String Name : "+str);
				
		System.out.println("Salary : "+flt);
		
		System.out.println("Cutting : "+dbl);

	}

	}
