public class Node
{
	private String name1;
	private String name2;
	private Node next;
	
	public Node(String d1, String d2, Node n)
	{
		name1 = d1;
		name2 = d2;
		next = n;
	}
	public String getName1()
	{
		return name1;
	}
	public String getName2()
	{
		return name2;
	}
	public Node getNext()
	{
		return next;
	}
	public void setNext(Node n)
	{
		next = n;
	}
	public void setName1(String d1, String d2)
	{
		name1 = d1;
		name2 = d2;
	}
	public String toString()
	{
		return name1+"-->";
	}
}
