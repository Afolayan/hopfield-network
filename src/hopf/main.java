package hopf;

import hopf.Reader;

/**
 * Class Main
 * @author Daniel Gynn (DJG44)
 * Stores the input values from the console and runs the Hopfield network with the specified patterns.
 */
public class Main {
	public static void main(String[] args) {
		// Get pattern file paths from command line input
		String storedPatternInput = args[0];
		String incompletePatternInput = args[1];
		
		// Store storedPattern and print to the console
		String sp = Reader.readFile(storedPatternInput);
		System.out.println("Stored pattern: " + sp);

		// Store incomepletePattern and print to the console
		String ip = Reader.readFile(incompletePatternInput);
		System.out.println("Incomplete pattern: " + ip);
	}
}
