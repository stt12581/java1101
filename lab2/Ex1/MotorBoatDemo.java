import java.util.Scanner;
public class MotorBoatDemo
{
	public static void main(String[] args)
	{
		//enter the fuel and consumption rate
		MotorBoat myBoat;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the fuel in tank: ");
		double f = keyboard.nextDouble();
		
		System.out.print("Enter the consumption rate: ");
		double r = keyboard.nextDouble();
		
		myBoat = new MotorBoat(f,r);
		System.out.println(myBoat);
		
		//change speed
		System.out.print("\nChange speed by(enter a value, positive or negative): ");
		double cSpeed = keyboard.nextDouble();
		System.out.println(myBoat.changeSpeed(cSpeed));
		
		//operate the boat at current speed
		System.out.print("Operate for (enter time in minutes): ");
		double t = keyboard.nextDouble();
		System.out.println(myBoat.travel(t));
	}
}
