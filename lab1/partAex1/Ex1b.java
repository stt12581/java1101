import java.util.Scanner;
public class Ex1b
{
	public static void main(String[] args)
	{
		System.out.print("Please enter an integer: ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();//get the number from keyboard
		System.out.println(isPerfect(number));
	}
	
	public static boolean isPerfect(int n)//using another method to check if the number is perfect
	{
		int factor=1;
		for(int i=2; i<n;i++)
		{
			if(n/i*i==n)
				factor += i;//check if it is the factor and add them together
		}
		if (factor == n)
			return true;
		else
			return false;
	}

} 