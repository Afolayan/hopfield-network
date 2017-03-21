package hopf;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Reader {
	private String pattern;

	public Reader() {
		this.setPattern(pattern);
	}
	
	public static void readFile(String pattern) {
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(pattern);
			br = new BufferedReader(fr);

			String file;

			br = new BufferedReader(new FileReader(pattern));

			while ((file = br.readLine()) != null) {
				System.out.println("File contents: " + file);
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
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}
