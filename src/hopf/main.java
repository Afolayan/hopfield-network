package hopf;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please enter the stored pattern: ");
		String storedPattern = read.nextLine();
		System.out.println(storedPattern);
		
		System.out.println("Please enter the incomplete pattern: ");
		String incompletePattern = read.nextLine();
		System.out.println(incompletePattern);
		
		read.close();
	}
}
