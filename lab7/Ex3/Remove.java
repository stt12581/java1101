import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
	public static void main(String[] args) {
		ArrayList<String> word1 = new ArrayList<String>(); // Create an arraylist
		Scanner keyboard = new Scanner(System.in);
		String name;
	 
		// Add elements to the word1
		System.out.println("Enter words on one line, end with -1");
		name = keyboard.next();
		while (!name.equals("-1")){
			if (word1.contains(name)==false)
				word1.add(name);
			name = keyboard.next();
		}

		//print word1 with no duplicates
		System.out.println("\nArray List with no duplicates:\n"+word1);
   }
}