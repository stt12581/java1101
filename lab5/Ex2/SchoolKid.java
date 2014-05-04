public class SchoolKid
{
	private String name;
	private int age;
	private String teacher;
	private String greeting;
	
	public SchoolKid()
	{
	}
	
	//set and get name
	public void setName(String newName)
	{
		name  = newName;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void setTeacher(String t)
	{
		teacher = t;
	}
	public void setGreeting(String g)
	{
		greeting = g;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getTeacher()
	{
		return teacher;
	}
	public String getGreeting()
	{
		return "Hello! ";
	}
	
	//toString method
	public String toString()
	{	
		return "Name: "+name+"\nAge: "+age+"\nTeacher: "+teacher+"\nGreeting: "+greeting;
	}

}