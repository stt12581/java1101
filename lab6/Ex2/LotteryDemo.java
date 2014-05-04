import java.util.Scanner;
public class LotteryDemo
{
	public static void main(String[] args)
	{
		//create a new lottery object
		Lottery l = new Lottery();
		Scanner keyboard = new Scanner(System.in);
		
		int[] user = new int[5];
		
		System.out.print("Enter 5 integers between 1 to 9: ");
		for (int i=0; i<5; i++)
			user[i] = keyboard.nextInt();
		
		l.user(user);
		
		System.out.println(l);
	}
	
}