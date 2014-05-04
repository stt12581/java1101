public class StudentDemo
{
	public static void main ( String[] args)
	{
		//set two objects
		Student John = new Student();
		John.setName("John");
		John.setStudentNumber(3678);
		System.out.println(John);
	
		Student Tom = new Student();
		Tom.reset("Tom", 4986);
		System.out.println(Tom);
	
		if ( John.hasSameName(Tom) )
			System.out.println("The two students have the same name.");
		else
			System.out.println("The two students have the different name.");
		
		if ( John.equals(Tom) )
			System.out.println("The two students have the same name and same number.");
		else
			System.out.println("The two students have the different name or number.");
		
	}
}