//Rectangle2D.java
public class Rectangle2D
{
	//instance variables
	private int xpos;
	private int ypos;
	private int width;
	private int height;
	
	//constructors
	public Rectangle2D(int x, int y, int width, int height)
	{
		xpos = x;
		ypos = y;
		this.width = width;
		this.height = height;
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
	public void setWidth(int width)
	{
		this.width = width;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public int getXpos()
	{
		return xpos;
	}
	public int getYpos()
	{
		return ypos;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	
	//other methods
	public String toString()
	{
		return "["+xpos+", "+ypos+"]";
	}
	
	//get area and perimeter
	public int getArea()
	{
		return width*height;
	}
	public int getPerimeter()
	{
		return 2*(width+height);
	}
	
	//check if the point is in the rectangle
	public boolean contains(int x, int y)
	{
		return (x>=xpos && x<=(xpos+width) && y>=ypos && y<=(ypos+height));
	}
	
}