import java.util.Scanner;

public class Unit1Project {

	public static void main(String[] args){	
		//User input section
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstName = keyboard.nextLine();
		
		System.out.println("What is your middle name?");
		String middleName = keyboard.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = keyboard.nextLine();
		
		System.out.println("What is your birthdate? Please enter in this format: mmddyyyy"); //THIS SHOULD BE MM-DD-YYYY
		String birthdate = keyboard.nextLine();

			
		System.out.println("Email: " + lastName.toLowerCase() + firstName.substring(0,1) + middleName.substring(0,1) + "@sharkmail.com");
		System.out.println("Temp Password: " + birthdate); //SHOULD BE THE BIRTHDAY PROCESSED
		System.out.println("*** This temporary password is very insecure.Please change it immediately! ***");
		

	}
}
// 90/100 Resubmit with proposed changes for a 100.
