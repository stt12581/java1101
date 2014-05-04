import java.util.Scanner;
public class RectangleDemo
{
	public static void main(String[] args)
	{
		Rectangle rect3;
		
		System.out.print("Enter length and width: ");
		Scanner keyboard = new Scanner(System.in);
		int l = keyboard.nextInt();
		int w = keyboard.nextInt();//get width and length

		rect3 = new Rectangle(l,w);
		System.out.println(rect3.toString()+"\nArea: "+rect3.findArea());//print length,width, and area
	}
}
