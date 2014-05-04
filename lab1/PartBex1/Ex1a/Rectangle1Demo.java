public class Rectangle1Demo
{
	public static void main(String[] args)
	{
		Rectangle rect1, rect2;

		rect1 = new Rectangle();
		rect2 = new Rectangle();
		rect1.setLength(10);
		rect1.setWidth(30);
		rect2.setLength(20);
		rect2.setWidth(25);

		System.out.println("Area of the first rectangle: " + rect1.findArea());
		System.out.println("Area of the second rectangle: " + rect2.findArea());
	}
}
