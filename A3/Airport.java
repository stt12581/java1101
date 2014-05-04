public class Airport
{	
	private String name;
	
	//constructor
	public Airport(String n) 
	{
		name = n;
	}	
	
	//get and set name
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	
	public String toString()
	{
		return "Airport Name: "+name;
	}
}
		