package in.geektrust.tameofthrones;

import java.io.FileNotFoundException;

import in.geektrust.tameofthrones.agoldencrown.AGoldenCrown;
import in.geektrust.tameofthrones.agoldencrown.AGoldenCrownImpl;

/**
 * Driver class having main.
 * 
 */
public class TameOfThrones {

	/**
	 * Main method accepts absolute path of input file as command-line argument.
	 * Instantiate AGoldenCrownImpl class (solver class) and calls its printRuler()
	 * method to print the output.
	 * 
	 * @param args command-line arguments.
	 * @throws FileNotFoundException if invalid path to input file is passed.
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 0) {
			throw new ArrayIndexOutOfBoundsException("Absolute path to input file is not passed!");
		}
		AGoldenCrown aGoldenCrown = new AGoldenCrownImpl(args[0]);
		aGoldenCrown.printRuler();
	}

}