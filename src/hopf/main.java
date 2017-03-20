package hopf;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please enter the stored pattern file: ");
		String storedPattern = read.nextLine();
		System.out.println(storedPattern);
		
//		System.out.println("Please enter the incomplete pattern file: ");
//		String incompletePattern = read.nextLine();
//		System.out.println(incompletePattern);
		
		read.close();
		
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(storedPattern);
			br = new BufferedReader(fr);

			String file;

			br = new BufferedReader(new FileReader(storedPattern));

			while ((file = br.readLine()) != null) {
				System.out.println(file);
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
}
