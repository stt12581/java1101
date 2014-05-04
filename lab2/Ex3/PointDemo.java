import java.util.Scanner;
public class PointDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x1,y1,x2,y2,x3,y3,x4,y4;
		//get the values for 2 points
		System.out.print("Enter the x and y coordinates for point1: ");
		x1 = keyboard.nextInt();
		y1 = keyboard.nextInt();
		System.out.print("Enter the x and y coordinates for point2: ");
		x2 = keyboard.nextInt();
		y2 = keyboard.nextInt();
		System.out.print("Enter the x and y coordinates for point3: ");
		x3 = keyboard.nextInt();
		y3 = keyboard.nextInt();
		System.out.print("Enter the x and y coordinates for point4: ");
		x4 = keyboard.nextInt();
		y4 = keyboard.nextInt();
		
		//create four Points
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		Point p3 = new Point(x3,y3);
		Point p4 = new Point(x4,y4);
		
		//compare which point is highest
		if (p1.isHigher(p2)== true)
		{
			if (p3.isHigher(p4)== true)
			{
				if (p1.isHigher(p3)== true)
					System.out.println(p1+" is the highest point");
				else
					System.out.println(p3+" is the highest point");
			}
			else
			{
				if (p1.isHigher(p4)== true)
					System.out.println(p1+" is the highest point");
				else
					System.out.println(p4+" is the highest point");
			}
		}
		else
		{
			if (p3.isHigher(p4)== true)
			{
				if (p2.isHigher(p3)== true)
					System.out.println(p2+" is the highest point");
				else
					System.out.println(p3+" is the highest point");
			}
			else
			{
				if (p2.isHigher(p4)== true)
					System.out.println(p2+" is the highest point");
				else
					System.out.println(p4+" is the highest point");
			}
		}
		
		//find the length
		double length1 = p1.findLength(p2);
		double length2 = p3.findLength(p4);
		System.out.println("The length between "+p1+" and "+p2+" is "+length1);
		System.out.println("The length between "+p3+" and "+p4+" is "+length2);
		
		if (length1 > length2)
			System.out.println("Line from "+p1+" to "+p2+" is longer");
		else if(length1 < length2)
			System.out.println("Line from "+p3+" to "+p4+" is longer");
		else
		
			System.out.println("Line from "+p1+" to "+p2+" is the same as from "+p3+" to "+p4);
	}
}
