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
		
		System.out.println("What is your birthdate? Please enter in this format: mmddyyyy");
		String birthdate = keyboard.nextLine();

			
		System.out.println("Email: " + lastName.substring(0,lastName.length()).toLowerCase() + firstName.substring(0,1) + middleName.substring(0,1) + "@sharkmail.com");
		System.out.println("Temp Password: " + birthdate);
		System.out.println("*** This temporary password is very insecure.Please change it immediately! ***");
		

	}
}
