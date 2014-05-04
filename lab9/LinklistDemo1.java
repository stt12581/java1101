public class LinklistDemo1
{
	public static void main(String[] args)
	{
		//create linkedlist cities
		LinkedList cities = new LinkedList(); 
		cities.addToFront("Toronto"); 
		cities.addToFront("New York"); 
		cities.addToFront("Calgary"); 
		cities.addToFront("Halifax"); 
		cities.addToFront("St.John's");  
		
		System.out.println("Number of cities: " + cities.size()); 
		cities.enumerate(); 
		
		//remove the second and the 4th(5th for original linkedlist)
		downsize(cities, 2);
		downsize(cities, 4);
		
		//reverse
		reverse(cities);
		System.out.println();
		
		//create another linkedlist alph
		LinkedList alph = new LinkedList(); 
		alph.addToFront("E"); 
		alph.addToFront("D"); 
		alph.addToFront("C"); 
		alph.addToFront("B"); 
		alph.addToFront("A"); 
		alph.addToEnd("F"); 
		alph.addToEnd("G"); 
		
		System.out.println("Number of cities: " + alph.size()); 
		alph.enumerate(); 
		System.out.println();
		
		//get the interleave for the two linkedlist above
		LinkedList leave = interleave(cities,alph);
		leave.enumerate(); 
		System.out.println();
		
		//remove odd element for alph
		alph = chopSkip(alph);
		alph.enumerate(); 
	
	}
	
	//remove the given element from linkedlist
	public static void downsize(LinkedList list, int n)
	{
		if(list.size()<n)
			System.out.println("Can't remove out of bound");
		else
			list.remove(n-1);
		list.enumerate();
	}
	
	//find the reverse for given linkedlist
	public static void reverse(LinkedList list)
	{
		if(list.size()==1)
			return;
		else{
			Node curr = list.getFirstNode();
			for(int i=1; i<list.size();i++){
				list.addToFront(curr.getNext().getData());
				list.remove(i+1);
			}
		}	
		list.enumerate();
	}
	
	public static LinkedList interleave (LinkedList list1, LinkedList list2)
	{
		int i=1;
		LinkedList list3 = new LinkedList();
		Node curr1 = list1.getFirstNode();
		Node curr2 = list2.getFirstNode();
		while(curr1!= null && curr2!=null)
		{
			if(i%2 == 1){//if it's odd number, add the element from list1
				list3.addToEnd(curr1.getData());
				curr1 = curr1.getNext();
				i++;
			}
			else{//otherwise, add from list2
				list3.addToEnd(curr2.getData());
				curr2 = curr2.getNext();
				i++;
			}
		}
		while(curr1 != null){//if size of list1 is larger, add the remaining elements to the end of list3
			list3.addToEnd(curr1.getData());
			curr1 = curr1.getNext();
		}
		while(curr2 != null){//if size of list2 is larger, add the remaining elements to the end of list3
			list3.addToEnd(curr2.getData());
			curr2 = curr2.getNext();
		}
		return list3;
	}
	
	//remove odd number elements
	public static LinkedList chopSkip(LinkedList list)
	{
		for(int i=1;i<list.size();i++)
			list.remove(i);
		return list;
	}
}