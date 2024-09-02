import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) {
		
		// Instantiate a dictionary
		Dictionary dictionary = new Dictionary();
		
		// Populate the dictionary
		try {
			dictionary.populate();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// Search the dictionary
		dictionary.find("shrift");
		dictionary.find("egad");
		dictionary.find("gyve");
		dictionary.find("sooth");
		dictionary.find("ceil");
		dictionary.find("bicycle");
		
		
		// Print the dictionary
		System.out.println();
		dictionary.print();

		

	}

}
