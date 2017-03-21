package hopf;

import java.util.Scanner;

import hopf.Reader;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Enter the file path for the stored pattern
		System.out.println("Please enter the stored pattern file: ");
		String storedPattern = scan.nextLine();
		System.out.println("Stored Pattern file: " + storedPattern);
		
		// Enter the file path for the incomplete pattern
		System.out.println("Please enter the incomplete pattern file: ");
		String incompletePattern = scan.nextLine();
		System.out.println("Incomplete pattern file: " + incompletePattern);
		
		scan.close();
		
		// Call the Reader class to display the text file content
		Reader.readFile(storedPattern);
		Reader.readFile(incompletePattern);
	}
}
