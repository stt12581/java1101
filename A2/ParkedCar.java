public class ParkedCar
{
	private String make;
	private String model;
	private String color;
	private int num;
	
	//constructor
	public ParkedCar(String make, String model, String c, int n)
	{
		this.make = make;
		this.model = model;
		color = c;
		num = n;
	}
	
	//set and get methods
	public void setMake(String m)
	{
		make = m;
	}
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}
	public int getNum()
	{
		return num;
	}
	//toString method
	public String toString ()
	{
		return "The car make: "+make+"\tmodel: "+model+"\tcolor: "+color+"\tnumber: "+num;
	}
	
	
}
	