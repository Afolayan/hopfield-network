package hopf;

import hopf.Reader;
import hopf.Hopfield;

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
		
		// Store patterns from file reader
		String sp = Reader.readFile(storedPatternInput);
		String ip = Reader.readFile(incompletePatternInput);
		
		// Create new Hopfield class for stored pattern and print to the console
        Hopfield spNetwork = new Hopfield("Stored", sp);
        spNetwork.printPattern();
        int[] intPattern = spNetwork.getPattern(sp);
        spNetwork.train(intPattern);
        
		// Create new Hopfield class for incomplete pattern and print to the console
        Hopfield ipNetwork = new Hopfield("Incomplete", ip);
        ipNetwork.printPattern();
	}
}
