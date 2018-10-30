/**
 * 
 */

/**
 * @author Xabier
 *
 */
import java.util.Scanner; 	// To use Scanner 
import java.io.*;			//To use File
public class Ex_1_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// Define a file with the first token from console (the path of the text file)
		File text = new File(args[0]);
		// Define a scanner that is going to take information from the file
		Scanner sc = new Scanner(text);
		
		// While there is a new token in the scanned file
		while(sc.hasNext()) {
			
			// Use the end of the input as terminator
			sc.useDelimiter("\\z");
			
			// Print the next token
			System.out.println(sc.next());
			
			
		}
		
	}

}
