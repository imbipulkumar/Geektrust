package in.geektrust.tameofthrones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import in.geektrust.tameofthrones.agoldencrown.AGoldenCrown;
import in.geektrust.tameofthrones.agoldencrown.AGoldenCrownImpl;

public class TameOfThrones {

	public static void main(String[] args) throws FileNotFoundException {
		List<ArrayList<String>> messages = new ArrayList<ArrayList<String>>();
		File input = new File(args[0]);
		// "C:\\Users\\BIPUL KUMAR\\Documents\\Geektrust\\Tameofthrones\\src\\main\\resources\\SampleInput1.txt"
		Scanner scanner = new Scanner(input);
		while (scanner.hasNextLine()) {
			String message = scanner.nextLine();
			messages.add(new ArrayList<String>(Arrays.asList(message.split(" "))));
		}
		AGoldenCrown aGoldenCrown = new AGoldenCrownImpl(messages);
		aGoldenCrown.ruler();
		scanner.close();

	}

}