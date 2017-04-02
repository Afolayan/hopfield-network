package hopf;

import hopf.Reader;
import hopf.Hopfield;

import java.io.IOException;

/**
 * Class Main
 * @author Daniel Gynn (DJG44)
 * Stores the input values from the console and runs the Hopfield network with the specified patterns.
 */
public class Main {
    static Hopfield trainingPattern;
   
	public static void main(String[] args) throws IOException {
		// Get pattern file paths from command line input
		String storedPatternInput = args[0];
		String incompletePatternInput = args[1];

		// Store patterns, by line, from file reader
		String[] sp = Reader.readFile(storedPatternInput);
		String[] ip = Reader.readFile(incompletePatternInput);
	
		for (int i = 0; i < sp.length; i++) {
		    float[] storedPattern = Hopfield.getPattern(sp[i]);
			
			// Get training pattern and run the learning function.
			trainingPattern = new Hopfield(storedPattern.length);
			trainingPattern.learn(storedPattern);
		}
		
		for (int j = 0; j < ip.length; j++) {
		    // Get the patterns into int array format
			float[] incompletePattern = Hopfield.getPattern(ip[j]);
			
			// Generate the network output.
	        Hopfield.generateOutput(trainingPattern, incompletePattern);
		}
	}
}
