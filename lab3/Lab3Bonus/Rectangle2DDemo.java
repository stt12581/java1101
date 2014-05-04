import java.util.Scanner;
public class Rectangle2DDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x1=0,y1=0,x2=0,y2=0, width, height;
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);

		//get the two points for rectangle, width and height
		while( (p1.isLeftOf(p2) && p1.isHigher(p2)) == false)
		{
			System.out.print("Enter the x and y coordinates for the top left hand corner point of rectangle: ");
			x1 = keyboard.nextInt();
			y1 = keyboard.nextInt();
			System.out.print("Enter the x and y coordinates for the bottom right hand corner point of rectangle: ");
			x2 = keyboard.nextInt();
			y2 = keyboard.nextInt();
			p1 = new Point(x1,y1);
			p2 = new Point(x2,y2);
		}
			
		width = x2-x1;
		height = y2-y1;

		//create the point and two rectangles
		Point p3 = new Point(4,6);
		Point p4 = new Point(11,27);
		Rectangle2D rect = new Rectangle2D (p1,p2,width,height);
		Rectangle2D r = new Rectangle2D (p3,p4,7,21);
		//check if the rectangle contains the point
		Point check = new Point(14,23);
		if(rect.contains(check))
			System.out.println("The rectangle contains the point.");
		else
			System.out.println("The rectangle doesn't contain the point.");

		//check if the rectangle rect contains smaller rectangle r
		if(rect.containsRect(r))
			System.out.println("The rectangle contains the smaller rectangle r.");
		else
			System.out.println("The rectangle doesn't contain the smaller rectangle r.");
	}
}
