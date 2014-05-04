public class ArrowDemo
{
	public static void main ( String[] args)
	{
		//set two objects
		RightArrow arrowR = new RightArrow(15, 11);
		arrowR.drawRight();
		
		LeftArrow arrowL = new LeftArrow(7, 9);
		arrowL.drawLeft();
	}
}