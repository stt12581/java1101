import java.util.ArrayList;

public class LinkedList 
{ 
	private Node front; 
	private int count; 
	
	//constructor 
	public LinkedList() 
	{ 
		front = null; 
		count = 0; 
	} 
	
	//add a node to the front of the linked list 
	public void addToFront(String d) 
	{ 
		Node n; 
		n = new Node(d, front); 
		front = n; 
		count++; 
	} 
	
	//get the current size of the list 
	public int size() 
	{ 
		return count; 
	}
	
	//check if the list is empty 
	public boolean isEmpty() 
	{ 
		if (front==null) 
			return true; 
		else 
			return false; 
	} 
	
	//clear the list 
	public void clear() 
	{ 
		front = null; 
		count=0; 
	} 
	
	//get the content of the first node 
	public String getFront() 
	{ 
		if (front==null) 
			return "Empty list"; 
		else 
			return front.getData(); 
	} 
	
	//new method added - get the first node 
	public Node getFirstNode() 
	{ 
		return front; 
	} 
	
	//scan the list and print contents 
	public void enumerate() 
	{ 
		Node curr = front; 
		while (curr!=null) 
		{ 
			System.out.print(curr); 
			curr = curr.getNext(); 
		} 
		System.out.println(); 
	} 
	
	//remove front node 
	public void removeFront() { 
		if (front==null) { 
			System.out.println("Empty list"); 
		} 
		else { 
			front = front.getNext(); 
			count--; 
		} 
	} 
		
	//add a node to the end 
	public void addToEnd(String d) {
		Node n = new Node(d, null); 
		Node curr = front; 
		if (front==null) 
			front = n; 
		else { 
			while (curr.getNext()!=null) 
				curr = curr.getNext(); 
			curr.setNext(n); 
		} 
		count++; 
	} 
	
	//remove last node 
	public void removeLast() { 
		if (front==null) { 
			System.out.println("Empty list"); 
		} 
		else if (front.getNext()==null) { 
			front = null; 
			count--; 
		} 
		else { 
			Node curr = front; 
			while (curr.getNext().getNext()!=null) 
				curr = curr.getNext(); 
			curr.setNext(null); 
			count--; 
		}
	} 
	
	//search for a given data and return the index of the node (first occurrence) 
	//return -1 if not found 
	public int contains(String d) { 
		Node curr = front; 
		boolean found = false; 
		int index = -1; 
		while (curr!=null&&!found) { 
			index++; 
			if (curr.getData().equals(d)) 
				found=true; 
			curr= curr.getNext(); 
		} 
		if (!found) 
			return -1; 
		else 
			return index; 
	} 
		
	//add a node at a given index 
	public void add(int index, String d) { 
		if (index<0 || index>size()) 
			System.out.println("Can't add. Index out of bounds"); 
		else { 
			if (index==0) addToFront(d); 
			else { 
				Node curr = front; 
				for(int i=0; i<index-1; i++) 
					curr = curr.getNext(); 
				Node n = new Node(d,curr.getNext()); 
				curr.setNext(n); 
				count++; 
			} 
		} 
	} 
	
	//remove a node at a given index 
	public void remove(int index) { 
		if (index<0 || index>=size()) 
			System.out.println("Can't remove. Index out of bounds"); 
		else if (index==0) 
			removeFront(); 
		else if (index==size()-1) 
			removeLast(); 
		else { 
			Node curr = front; 
			for(int i=0;i<index-1;i++) 
				curr = curr.getNext(); 
			curr.setNext(curr.getNext().getNext()); 
			count--; 
		} 
	} 
	
	//set a node at a given index
	public void set(int index, String d){
		if (index<0 || index>size()) 
			System.out.println("Can't remove. Index out of bounds"); 	
		else if (index==0)
			front.setData(d);
		else if (index==size())
			addToEnd(d);
		else{
			Node curr = front;
			for(int i=0;curr.getNext()!=null && i<index; i++)
				curr = curr.getNext();
			curr.setData(d);
		}
	}
	
	//print the indices of all the nodes contain a given string
	public void listAll(String d){
		Node curr = front; 
		boolean found = false; 
		int index = -1; 
		while (curr!=null) { 
			index++; 
			if (curr.getData().equals(d)){
				System.out.print(index+" ");
				found=true; 
			}
			curr= curr.getNext(); 
		} 
		System.out.print("\n");
		if (!found) 
			System.out.println("-1"); 
	} 
	
	//convert to arraylist
	public ArrayList<String> convertToArrayList(){
		ArrayList<String> convert = new ArrayList<String>();
		if(count!=0){
			Node curr = front;
			for(int i=0; i<count&&curr!=null; i++){
				convert.add(curr.getData());
				curr = curr.getNext();
			}
		}
		return convert;
	}
}


