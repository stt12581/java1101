public class RoomDimension
{
	private double length;
	private double width;

	public RoomDimension(double l,double w)
	{
		length = l;
		width = w;
	}
	
	//get length, width, and area
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getArea()
	{
		return width*length;
	}
	//print the information out
	public String toString()
	{
		return "Length: "+length+"\nWidth: "+width+"\nArea: "+getArea();
	}
		
}
