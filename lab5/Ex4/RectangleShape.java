public class RectangleShape extends LineShape
{
	private int height;
	private int width;
	
	public RectangleShape(int offset, int h, int w)
	{
		setOffset(offset);
		height = h;
		width = w;
	}
	
	//draw a rectangle
	public void drawHere()
	{
		drawWithOffset(width);
		skipLines(1);
		drawSides();
		skipLines(1);
		drawWithOffset(width);
	}
	
	//draw two sides of height
	public void drawSides()
	{
		for (int i=1; i<=height-3; i++)
		{
			drawWithOffset();
			skipSpaces(width-2-getOffset());
			drawWithOffset();
			skipLines(1);
		}
		drawWithOffset();
		skipSpaces(width-2-getOffset());
		drawWithOffset();
	}
}