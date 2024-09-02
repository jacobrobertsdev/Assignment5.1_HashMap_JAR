import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Dictionary simulates a collection of words and their definitions Uses the
 * HashMap class to model the dictionary HashMap is populated from a
 * tab-delimited .txt file
 * 
 */
public class Dictionary {

	private HashMap<String, String> dictionary;

	/**
	 * Default constructor
	 * Instantiates a new HashMap of String keys and String values
	 */
	public Dictionary() {
		dictionary = new HashMap<String, String>();
	}

	/**
	 * This method populates the HashMap dictionary by reading a .txt file
	 * 
	 * @throws FileNotFoundException
	 */
	public void populate() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("src/WordValuePairs.txt"));

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] data = line.split("\t");
			String key = data[0];
			String value = data[1];
			dictionary.put(key, value);
		}
		scan.close();
	}

	/**
	 * This method searches the dictionary for the word passed in Prints the word,
	 * definition, and the hash
	 * 
	 * @param key The word to find
	 */
	public void find(String key) {

		String definition = dictionary.get(key);

		if (definition == null) {
			System.out.println("Word not found: " + key);
		} else {
			System.out.println("[ Word: " + key + ", Definition: " + definition + ", Hash: " + key.hashCode() + " ]");

		}

	}

	/**
	 * This method prints the entire dictionary
	 * 
	 */
	public void print() {

		for (String key : dictionary.keySet()) {
			System.out.println(key + ": " + dictionary.get(key));
			System.out.println();
		}
	}
}
