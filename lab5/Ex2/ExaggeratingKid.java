public class ExaggeratingKid extends SchoolKid
{
	public ExaggeratingKid()
	{
	}
	
	//override two methods
	public int getAge()
	{
		return super.getAge()+2;
	}
	public String getGreeting()
	{
		return super.getGreeting()+"I am the best!";
	}
	//toString method
	public String toString()
	{
		return "Name: "+getName()+"\nAge: "+(super.getAge()+2)+"\nTeacher: "+getTeacher()+"\nGreeting: "+getGreeting();
	}
}
