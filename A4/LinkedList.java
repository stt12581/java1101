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
	public void addToFront(String d1, String d2)
	{
		Node n;
		n = new Node(d1, d2, front);
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
	
	//add a node to the end
	public void addToEnd(String d1, String d2)
	{
		Node n = new Node(d1, d2, null);
		Node curr = front;
		if (front==null)
			front = n;
		else
		{
			while (curr.getNext()!=null)
				curr = curr.getNext();
			curr.setNext(n);
		}
		count++;		
	}

	//search for a given name1
	public boolean contains(String d)
	{
		Node curr = front;
		boolean found = false;
		while (curr!=null&&!found)
		{
			if (curr.getName1().equals(d))
				found=true;
			curr= curr.getNext();
		}
		return found;
	}
	
	//return the string which is in name1 but not duplicate
	public String responsible(){
		Node curr = front;
		String result = "";
		
		while(curr != null)
		{
			Node dup = front;
			boolean found = false;
			while (curr!=dup&&!found)
			{
				if (dup.getName1().equals(curr.getName1()))
					found = true;
				dup= dup.getNext();
			}

			if(found==false)
				result += curr.getName1()+ "  ";
			curr = curr.getNext();
		}	

		return result;
	}
	
	//return the string which is in name2 but not in name1
	public String notResp(){
		Node curr = front;
		String result = "";
		
		while(curr != null)
		{
			if(!contains(curr.getName2()))
				result += curr.getName2()+ "  ";
			curr = curr.getNext();
		}	
		return result;
	}
	
	//return the string which is in name2 of the given name1
	public String direct(String d){
		Node curr = front;
		String result = "";
		
		while(curr != null)
		{
			if(d.equals(curr.getName1()))
				result += curr.getName2()+ "  ";
			curr = curr.getNext();
		}	
		return result;
	}
	
	//return string which have contracted from given name1 via a chain of n
	public String contract(String d, int n){
		ArrayList<String> list = new ArrayList<String>();
		String result = "", name = d;
		int num;
		Node curr = front;
		
		while(curr != null){
			if(d.equals(curr.getName1()) && !list.contains(curr.getName2())){
				num = n;
				list.add(curr.getName2());
				num--;
				name = curr.getName2();
				
				Node cur2 = front;
				while(cur2 != null && num>=1){
					if(name.equals(cur2.getName1()) && !list.contains(cur2.getName2())){
						list.add(cur2.getName2());
						num--;
						name = cur2.getName2();
						cur2 = front;
					}
					cur2 = cur2.getNext();
				}
			}
			curr = curr.getNext();
		}
		
		for(int i=0;i<list.size();i++)
			result += list.get(i)+"	";
		return result;
	}
}			
		