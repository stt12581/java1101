public class LinkedListDemo 
{ 
	public static void main(String[] args) 
	{ 
		LinkedList cities = new LinkedList(); 
		cities.addToFront("Toronto"); 
		cities.addToFront("New York"); 
		cities.addToFront("Calgary"); 
		cities.addToFront("Halifax"); 
		cities.addToFront("St.John's"); 
		cities.set(0,"A");
		cities.set(5,"B");
		cities.set(3,"C");
		cities.set(4,"D");
		cities.addToEnd("C"); 
		cities.listAll("C");
		cities.listAll("G");
		
		System.out.println("Number of cities: " + cities.size()); 
		cities.enumerate(); 
		
		System.out.println(cities.convertToArrayList());
	} 
} 
