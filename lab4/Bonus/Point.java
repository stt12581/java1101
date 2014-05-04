public class Point{
	
	//instance variables
	private int xpos, ypos;
	
	//constructor
	public Point(int xpos,int ypos)
	{
		this.xpos=xpos;
		this.ypos=ypos;
	}
	
	//get and set methods
	public void setXpos(int xpos)
	{
		this.xpos=xpos;
	}
	public void setYpos(int ypos)
	{
		this.ypos=ypos;
	}
	
	public int getXpos()
	{
		return xpos;
	}
	public int getYpos()
	{
		return ypos;
	}
	
	//toString method
	public String toString(){
		return "("+xpos+","+ypos+")";
	}
	
	//find distance method
	public double distanceFrom(Point another){
		return Math.sqrt(Math.pow(xpos-another.getXpos(),2)+Math.pow(ypos-another.getYpos(),2));
	}
	
}