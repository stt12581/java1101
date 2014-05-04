public class Coin
{
	private String name;
	private int value;

	public Coin(String name, int value)
	{
		this.name = name;
		this.value = value;
	}
	
	//get name and value
	public String getName()
	{
		return name;
	}
	public int getValue()
	{
		return value;
	}
	//print the information out
	public String toString()
	{
		return "\nThe coin "+name+" has a value of "+value;
	}

}
