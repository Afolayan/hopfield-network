package hopf;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Class Reader
 * @author Daniel Gynn (DJG44)
 * Reads in the location of the input text file and returns the content.
 */
public class Reader {
	/*
	 * Takes in a String for the file path and returns the contents.
	 */
	public static String readFile(String pattern) {
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(pattern);
			br = new BufferedReader(fr);

			String content;

			br = new BufferedReader(new FileReader(pattern));

			while ((content = br.readLine()) != null) {
				return content;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
	
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return pattern;
	}
}
