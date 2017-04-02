package hopf;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Class Reader
 * @author Daniel Gynn (DJG44)
 * Reads in the location of the input text file and returns the content.
 */
public class Reader {
	public static String[] readFile(String strings) throws IOException {
		BufferedReader BufferedReader = new BufferedReader(new FileReader(strings));
		String str;
	
		try {
			ArrayList<String> list = new ArrayList<String>();
			while((str = BufferedReader.readLine()) != null){
			    list.add(str);
			}
		
			String[] stringArr = list.toArray(new String[0]);
			return stringArr;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (BufferedReader != null) {
					BufferedReader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}
	/*
	 * Takes in a String for the file path and returns the contents.
	 */
//	public static String readFile(String strings) {
//		BufferedReader br = null;
//		FileReader fr = null;
//		
//		try {
//			fr = new FileReader(strings);
//			br = new BufferedReader(fr);
//
//			String content;
//
//			br = new BufferedReader(new FileReader(strings));
//
//			while ((content = br.readLine()) != null) {
//				return content;
//			}					
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (br != null)
//					br.close();
//	
//				if (fr != null)
//					fr.close();
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}
//		return strings;
//	}
}
