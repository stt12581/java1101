public class FanDemo
{
	public static void main(String[] args)
	{
		Fan fan1,fan2;
		
		fan1 = new Fan();//set new fans
		fan2 = new Fan();
		fan1.setSpeed("FAST");//give specific number or name
		fan1.setRadius(10);
		fan1.setColour("yellow");
		fan1.setOn(true);
		fan2.setSpeed("MEDIUM");
		fan2.setRadius(5);
		fan2.setColour("blue");
		fan2.setOn(false);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());			
	}
}