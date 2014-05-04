import java.util.Scanner;
public class Rectangle2DDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x,y,width, height;
		
		//get the values for 2 points
		System.out.print("Enter the x and y coordinates for one point of rectangle: ");
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		System.out.print("Enter the width and height for rectangle: ");
		width = keyboard.nextInt();
		height = keyboard.nextInt();
		
		//create a rectangle
		Rectangle2D rect1 = new Rectangle2D(x,y,width,height);
		
		//find the area and perimeter
		System.out.println("The area of the rectangle "+rect1+" is "+rect1.getArea());
		System.out.println("The perimeter of the rectangle "+rect1+" is "+rect1.getPerimeter());
		
		//check if the rectangle contains the point
		System.out.print("Enter the x and y coordinates for point to check: ");
		int xcheck = keyboard.nextInt();
		int ycheck = keyboard.nextInt();
		if(rect1.contains(xcheck,ycheck))
			System.out.println("The rectangle contains the point");
		else
			System.out.println("The rectangle doesn't contain the point");
	}
}
