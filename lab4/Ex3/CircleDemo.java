public class CircleDemo
{
	public static void main(String[] args)
	{
		//build a new circle
		Point centre = new Point(5,10);
		Circle circle = new Circle(centre, 15);

		//build a new point to test
		Point test = new Point(20, 10);
		if (circle.contains(test))
			System.out.println("The circle contains the test point.");
		else
			System.out.println("The circle doesn't contain the test point.");
		if (circle.touchs(test))
			System.out.println("The circle touches the test point.");
		else
			System.out.println("The circle doesn't touch the test point.");
	}
}