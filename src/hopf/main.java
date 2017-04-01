package hopf;

import hopf.Reader;
import hopf.Hopfield;

/**
 * Class Main
 * @author Daniel Gynn (DJG44)
 * Stores the input values from the console and runs the Hopfield network with the specified patterns.
 */
public class Main {
    static Hopfield trainingPattern;
   
	public static void main(String[] args) {
		// Get pattern file paths from command line input
		String storedPatternInput = args[0];
		String incompletePatternInput = args[1];

		// Store patterns from file reader
		String sp = Reader.readFile(storedPatternInput);
		String ip = Reader.readFile(incompletePatternInput);

	    // Get the patterns into int array format
	    float[] storedPattern = Hopfield.getPattern(sp);
		float[] incompletePattern = Hopfield.getPattern(ip);
		
		// Get training pattern and run the learning function.
		trainingPattern = new Hopfield(storedPattern.length);
		trainingPattern.learn(storedPattern);
		
		// Generate the network output.
        Hopfield.generateOutput(trainingPattern, incompletePattern);
	}
}
