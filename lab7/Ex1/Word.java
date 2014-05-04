import java.util.ArrayList;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		ArrayList<String> word1 = new ArrayList<String>(); // Create two arraylists
		ArrayList<String> word2 = new ArrayList<String>();
		Scanner keyboard = new Scanner(System.in);
		String name;
	 
		// Add elements to the word1
		System.out.println("Enter words on one line, end with -1");
		name = keyboard.next();
		while (!name.equals("-1")){
			word1.add(name);
			name = keyboard.next();
		}
		
		// Add elements to the word2
		System.out.println("Enter words on one line, end with -1");
		name = keyboard.next();
		while (!name.equals("-1")){
			word2.add(name);
			name = keyboard.next();
		}
		
		//print word1, word2
		System.out.println(word1+"\n"+word2);
		
		// Remove elements from the word1 for the same elements
		for (int i=0; i<(word1.size());i++){
			if (word2.contains(word1.get(i)) == false){
				word1.remove(i);
				i--;
			}
		}
		
		//print the same elements
		System.out.println("Array List with common strings:\n"+word1);
   }
}
