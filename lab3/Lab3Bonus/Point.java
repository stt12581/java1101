//Point.java
public class Point
{
	//instance variables
	private int xpos;
	private int ypos;

	//constructors
	public Point(int x, int y)
	{
		xpos = x;
		ypos = y;
	}

	//set and get methods
	public void setXpos(int x)
	{
		xpos = x;
	}
	public void setYpos(int y)
	{
		ypos = y;
	}

	public int getXpos()
	{
		return xpos;
	}
	public int getYpos()
	{
		return ypos;
	}

	//other methods
	public String toString()
	{
		return "["+xpos+", "+ypos+"]";
	}

	//check if the point is higher or left than the other point
	public boolean isHigher(Point other)
	{
		return (ypos < other.getYpos());
	}
	public boolean isLeftOf(Point other)
	{
		return (xpos < other.getXpos());
	}

}