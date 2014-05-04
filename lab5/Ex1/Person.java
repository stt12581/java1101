public class Person
{
	private String name;
	
	public Person()
	{
	}
	
	//set and get name
	public void setName(String newName)
	{
		name  = newName;
	}
	public String getName()
	{
		return name;
	}
	//toString method
	public String toString()
	{	
		return "The name is "+name;
	}
	//check if they have the same name
	public boolean hasSameName(Person anotherPerson)
	{
		return name.equals(anotherPerson.getName());
	}
}