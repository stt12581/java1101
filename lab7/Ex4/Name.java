import java.util.ArrayList;
import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<String>(); // Create an arraylist to store names
		ArrayList<String> order = new ArrayList<String>(); //Create another arraylist to order names
		Scanner keyboard = new Scanner(System.in);
		String name;
	 
		System.out.println("Enter one name on each line:");
		
		//store names to the arraylist word
		name = keyboard.nextLine();
		while (!name.equals("")){
			//check if the arraylist is more than 10
			if(word.size()<=9){
				word.add(name);
				name = keyboard.nextLine();
			}
			else{
				System.out.println("The arraylist has crossed the boundary.\n");
				name = "";
			}
		}
			
		//add the element "empty" to order
		order.add("Empty");	
		System.out.println(order);
		
		//if the size of word is more than0, remove "empty" and order the names in the new arraylist
		if(word.size()!=0){
			order.remove(0);
			order.add(word.get(0));
			System.out.println(order);
			
			//for each element in word, compare each element in order until it meets more larger one
			for(int i=1;i<word.size();i++){
				for(int j=0;j<order.size();j++)
					if(word.get(i).compareTo(order.get(j)) <0){
						order.add(j,word.get(i));
						j=order.size();
						System.out.println(order);
					}

				//if an element still doesn't meet larger one, then put it in the end of the order
				if(order.contains(word.get(i))== false){
					order.add(word.get(i));
					System.out.println(order);
				}
			}
		}

   }
}