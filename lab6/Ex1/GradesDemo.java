import java.util.Scanner;
public class GradesDemo
{
	public static void main(String[] args)
	{
		//create a new object
		Grades g = new Grades();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter five students' name and scores. Score should be less than 100 but greater than 0");
		
		for (int i=0; i<5; i++)
		{
			System.out.print("Enter No."+(i+1)+" student's name: ");
			g.setName(keyboard.nextLine(), i);
			
			double score = -1;
			while (score<0 || score>100)//check if the score is in its domain
			{
				System.out.print("Enter No."+(i+1)+" student's score: ");
				score = keyboard.nextDouble();
			}
			g.setScore(score, i);
			keyboard.nextLine();
			
			g.findGrade(i);
		}
		
		System.out.println("\n"+g);
	}
	
}