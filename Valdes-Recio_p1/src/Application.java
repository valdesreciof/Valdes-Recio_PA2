import java.util.Scanner;

/*
 * Prompt user for 4 digit number 
 * Ask user if they want the number encrypted or decrypted
 * Encrypt or decrypt the 4 digit number 
 * Display result to user
 */

public class Application {
	
	private int getUserInput() {
		System.out.println("Please eneter a 4 digit number: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}

	private void displayNumber(int input) {
		System.out.printf("Your new number is: ");
		if(input<1000) {
			System.out.printf("0");
		}
		else if(input<100) {
			System.out.printf("00");
		}
		else if(input<10) {
			System.out.printf("000");
		}
		System.out.println(""+input);
		System.out.printf("To encrypt another number or decrypt the result please run me again.");
	}
	
	private boolean userWantsEncyption() {
		System.out.println("Please enter either 1 for encryption or 0 for decryption: ");
		Scanner scan2 = new Scanner(System.in);
		int input = scan2.nextInt();	
		scan2.close();
		if(input==1) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public static void main(String[] args) {
		
		int userInput, displayValue;
		Encrypter Encrypter = new Encrypter();
		Decrypter Decrypter = new Decrypter();
		Application Application = new Application();		
		
		userInput = Application.getUserInput();		
		if(Application.userWantsEncyption()) {
			displayValue =  Encrypter.encrypt(userInput);
		}
		else {
			displayValue =  Decrypter.decrypt(userInput);
		}
		Application.displayNumber(displayValue);
	}

}
