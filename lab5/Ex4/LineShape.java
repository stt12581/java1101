public class LineShape extends ShapeBasics
{
	public LineShape()
	{
	}
	
	public void setOffset(int off)
	{
		super.setOffset(off);
	}
	
	//draw vertical and horizontal line
	public void drawVertical(int length)
	{
		for (int i=1; i<=length; i++)
		{
			drawWithOffset(length);
			skipLines(1);
		}	
	}
	public void drawHorizontal(int length)
	{
		drawWithOffset(length);
	}

}
