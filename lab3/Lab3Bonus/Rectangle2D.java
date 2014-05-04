//Rectangle2D.java
public class Rectangle2D
{
	//instance variables
	private Point p1;
	private Point p2;
	private int width;
	private int height;

	//constructors
	public Rectangle2D(Point p1, Point p2, int w, int h)
	{
		this.p1 = p1;
		this.p2 = p2;
		width = w;
		height =h;
	}

	//set and get methods
	public void setP1(Point p1)
	{
		this.p1 = p1;
	}
	public void setP2(Point p2)
	{
		this.p2 = p2;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}

	public Point getP1()
	{
		return p1;
	}
	public Point getP2()
	{
		return p2;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}

	//check if the point or small rectangle is in the rectangle
	public boolean contains(Point p)
	{
		return (p.getXpos()>p1.getXpos() && p.getXpos()<p2.getXpos() && p.getYpos()>p1.getYpos() && p.getYpos()<p2.getYpos());
	}
	public boolean containsRect(Rectangle2D r)
	{
		return (p1.getXpos()<r.getP1().getXpos() && p2.getXpos()>r.getP2().getXpos() && p1.getYpos()<r.getP1().getYpos() && p2.getYpos()>r.getP2().getYpos());
	}
}