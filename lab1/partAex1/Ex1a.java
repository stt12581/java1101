import java.util.Scanner;
public class Ex1a
{
	public static void main(String[] args)
	{
		System.out.print("Please enter an integer: ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();//get the number from keyboard
		int factor=1;
		for(int i=2; i<number;i++)
		{
			if(number/i*i==number)
				factor += i;//check if it is the factor and add them together
		}
		if (factor == number)
			System.out.println(number+" is a perfect number.");
		else 
			System.out.println(number+" is not a perfect number.");
	}
} 