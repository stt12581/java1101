public class Student extends Person
{
	private int studentNumber;
	
	public Student()
	{
	}
	
	//reset name and number
	public void reset(String newName, int newNumber)
	{
		super.setName(newName);
		studentNumber = newNumber;
		
	}
	//set and get student number
	public int getStudentNumber()
	{
		return studentNumber;
	}
	public void setStudentNumber(int n)
	{
		studentNumber = n;
	}
	//toString method
	public String toString()
	{
		return super.toString()+" and student number is "+studentNumber;
	}
	//check if it is the same student
	public boolean equals(Student anotherStudent)
	{
		return (getName().equals(anotherStudent.getName() ) ) && (studentNumber == anotherStudent.getStudentNumber() );
	}
}