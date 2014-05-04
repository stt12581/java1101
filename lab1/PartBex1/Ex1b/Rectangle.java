public class Rectangle
{
	private int length;
	private int width;
	
	public Rectangle()
	{
	}
	public Rectangle(int length,int width)//use another constructor
	{
		this.length = length;
		this.width = width;
	}
	
	public void setLength(int length)//set the parameters
	{
		this.length = length;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public int getLength()//get the parameters
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public int findArea()
	{
		return length*width;
	}
	public String toString()
	{
		return "Length: "+length+ "\tWidth: "+width;
	}
}
