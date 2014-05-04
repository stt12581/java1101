public class Node
{
	private String data;
	private Node next;
	
	public Node(String d, Node n)
	{
		data = d;
		next = n;
	}
	public String getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setNext(Node n)
	{
		next = n;
	}
	public void setData(String d)
	{
		data = d;
	}
	public String toString()
	{
		return data + "-->";
	}
}
