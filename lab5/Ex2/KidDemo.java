public class KidDemo
{
	public static void main ( String[] args)
	{
		//set object
		ExaggeratingKid John = new ExaggeratingKid();
		John.setName("John");
		John.setAge(8);
		John.setTeacher("Tom");
		John.setGreeting(John.getTeacher()+" is the best teacher.");
		
		John.getAge();
		John.getGreeting();
		System.out.println(John);
		
	}
}