package hopf;

/**
 * Class Hopfield
 * @author Daniel Gynn (DJG44)
 */
public class Hopfield {
	private String input;
	private String patternType;
	private int[] pattern;
	private int numberOfNodes;

	/**
	 * Hopfield Class constructor.
	 * @param pattern
	 */
	public Hopfield(String patternType, String input) {
		this.patternType = patternType;
		this.input = input;
		this.pattern = getPattern(input);
		this.numberOfNodes = pattern.length;
	}


	/**
	 * Converts the input pattern to an array of integers.
	 * @param patternString
	 * @return
	 */
	public int[] getPattern(String patternString) {
		String[] array = patternString.split(" ");
		int[] pattern = new int[array.length];

		for(int i=0; i<array.length; i++)
		{
		    try {
		        pattern[i] = Integer.parseInt(array[i]);
		    } catch (NumberFormatException nfe) {
		        //Not an integer
		    }
		}

		return pattern;
	}

	public void makeNetwork(int[] pattern) {
		for (int i = 0; i < numberOfNodes; i++) {
			for (int j = 0; j < numberOfNodes; j++) {
				if (i == j) {
					continue;
				} else {
					int newWeight = ((2 * pattern[i]) - 1) * ((2 * pattern[j]) - 1);
					System.out.println(newWeight);
				}
			}
		}
	}

	/**
	 * Training algorithm to return the weights from each node.
	 * @param pattern
	 * @return
	 */
	public float[][] learn (int[] pattern) {
		float[][] weights = new float[numberOfNodes][numberOfNodes];

		for (int i = 0; i < numberOfNodes; i++) {
			for (int j = 0; j < numberOfNodes; j++) {
				if (i == j) {
					continue;
				} else {
					weights[i][j] = pattern[i] * pattern[j];
				}
			}
		}

		return weights;
	}

	/**
	 * Prints the pattern contents.
	 */
	public void printPattern() {
		System.out.println(patternType + " pattern: " + input + "\nNumber of nodes: " + numberOfNodes);
	}
}
