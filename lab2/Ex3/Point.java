//Point.java
public class Point
{
	//instance variables
	private int x;
	private int y;
	
	//constructors
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//set and get methods
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	//other methods
	
	//compare which point is higher
	public boolean equals(Point other)
	{
		return (x==other.getX()&&y==other.getY());
	}
	public boolean isHigher(Point other)
	{
		return (y < other.getY());
	}
	
	//get the length of two points
	public double findLength(Point other)
	{
		double length = Math.sqrt(Math.pow((x- other.getX()),2)+Math.pow((y-other.getY()),2));
		return length;
	}
	
	public String toString()
	{
		return "["+x+", "+y+"]";
	}
}