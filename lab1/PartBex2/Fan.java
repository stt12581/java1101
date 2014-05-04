public class Fan
{
	private String speed;
	private boolean on;
	private double radius;
	private String colour;
	
	public Fan()
	{
	}
	
	public void setSpeed(String speed)//set each parameter
	{
		this.speed = speed;
	}
	public void setOn(boolean on)
	{
		this.on = on;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public String getSpeed()//get each parameter
	{
		return speed;
	}
	public boolean getOn()
	{
		return on;
	}
	public double getRadius()
	{
		return radius;
	}
	public String getColour()
	{
		return colour;
	}
	
	public String toString()//use another method to print the information
	{
		if(on == true)
			return "The speed of the "+colour+" fan is "+speed+" and the radius is "+radius;
		else
			return "The radius of the "+colour+" fan is "+radius+" and the fan is off";
	}
}