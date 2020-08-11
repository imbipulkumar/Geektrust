package in.geektrust.tameofthrones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import in.geektrust.tameofthrones.agoldencrown.AGoldenCrown;
import in.geektrust.tameofthrones.agoldencrown.AGoldenCrownImpl;

/**
* Driver class having main.
* 
*/
public class TameOfThrones {

	/**
	* Main method read input file and prepare appropriate
	* data structure which passed to a solver class to get the output.
	* @param args command-line arguments.
	* @exception ArrayIndexOutOfBoundsException if no command-line arguments is passed.
	* @exception FileNotFoundException if invalid path to input file is passed.
	* 
	*/
	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 0) {
			throw new ArrayIndexOutOfBoundsException("Absolute path to input file is not passed!");
		}
		List<ArrayList<String>> messages = new ArrayList<ArrayList<String>>();
		File input = new File(args[0]);
		Scanner scanner = new Scanner(input);
		while (scanner.hasNextLine()) {
			String message = scanner.nextLine();
			messages.add(new ArrayList<String>(Arrays.asList(message.split(" ", 2))));
		}
		AGoldenCrown aGoldenCrown = new AGoldenCrownImpl(messages);
		aGoldenCrown.ruler();
		scanner.close();

	}

}