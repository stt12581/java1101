public class Grades
{
	//instance variables
	private String [] name = new String [5];
	private char [] grade = new char [5];
	private double[] score = new double [5];
	
	//constructor
	public Grades()
	{
	}
	
	//set and get methods
	public void setName(String n, int index) 
	{
		name[index] = n;
	}
	public String getName(int in) 
	{
		return name[in];
	}
	
	public void setScore(double s, int index) 
	{
		score[index] = s;
	}
	public double getScore(int in) 
	{
		return score[in];
	}
	
	public void findGrade(int index) 
	{
		double n = score[index];
		
		if (n >= 90)
			grade[index] = 'A';
		else if (n >= 80)
			grade[index] = 'B';
		else if (n >= 70)
			grade[index] = 'C';
		else if (n >= 60)
			grade[index] = 'D';
		else
			grade[index] = 'F';	
	}
	
	public char getGrade(int in) 
	{
		return grade[in];
	}
	
	//toString method
	public String toString()
	{
		String result = "";
		for (int i=0; i<5; i++)
			result += "Student: "+name[i] + "   score: "+score[i]+ "   grade: "+grade[i]+"\n";
		return result;
	}
}