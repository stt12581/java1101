public class Circle
{
	private Point centre;
	private double radius;
		
	public Circle()
	{
		centre = new Point(0,0);
		radius = 1.0;
	}
	public Circle(Point c, double r)
	{
		centre = new Point(c.getX(), c.getY());
		radius = r;
	}
	//get area and perimeter
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter()
	{
		return Math.PI*2*radius;
	}
	//check if the point inside the circle 
	public boolean contains(Point p)
	{
		return (p.distanceFrom(centre)<radius);
	}
	public boolean touchs(Point p)
	{
		return (p.distanceFrom(centre)==radius);
	}
}
