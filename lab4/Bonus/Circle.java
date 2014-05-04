public class Circle{

	//instance variables
	private Point center;
	private double radius;
	
	//constructor with nor-arg
	public Circle()
	{
		this.center=new Point(0,0);
		this.radius=1;
	}
	
	//constructor
	public Circle(Point center, double radius)
	{
		this.center=center;
		this.radius=radius;
	}
	
	//get and set methods
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public Point getCenter()
	{
		return center;
	}
	
	//toString method
	public String toString()
	{
		return "the circle which center point is "+center+" with radius "+radius;
	}
	
	//get area and perimeter methods
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	
	//contains method
	public boolean contains(Point p)
	{
		return center.distanceFrom(p)<radius;
	}
	
	//touches method
	public boolean touches(Point p)
	{
		return center.distanceFrom(p)==radius;
	}
	
	//contains circle method
	public boolean contains(Circle c)
	{
		if(radius-c.getRadius()>0)
			return Math.abs(radius-c.getRadius())>center.distanceFrom(c.getCenter());
		
		else
			return false;
		
	}
	
	//overlaps circle method
	public boolean overlaps(Circle c)
	{
		return (Math.abs(radius-c.getRadius())<center.distanceFrom(c.getCenter())&&center.distanceFrom(c.getCenter())<(radius+c.getRadius()));
	}
	
	//touches circle method
	public boolean touches(Circle c)
	{
		return (Math.abs(radius-c.getRadius())==center.distanceFrom(c.getCenter()))||Math.abs(radius+c.getRadius())==center.distanceFrom(c.getCenter());
	}
	
}
	