public class RightArrow extends ShapeBasics
{
	private int tail;
	private int width;
	
	public RightArrow(int t, int w)
	{
		//check if the width is an odd number
		if( w%2 == 1)
			width = w;
		else
			System.out.println("The width should be an odd number. \n");
		
		tail = t;
	}
	
	//set and get methods
	public void setTail(int t)
	{
		tail = t;
	}
	public void setWidth(int w)
	{
		//check if the width is an odd number
		if( w%2 == 1)
			width = w;
		else
			System.out.println("The width should be an odd number. \n");
	}
	public int getTail()
	{
		return tail;
	}
	public int getWidth()
	{
		return width;
	}
	
	//draw the right arrow
	public void drawRight()
	{
		//draw the triangle above the tail
		for(int i=0; i<(width/2); i++ )
		{
			skipSpaces(tail-1);
			draw();
			if (i != 0)
			{
				skipSpaces(2*i);
				draw();
			}
			skipLines(1);
		}
		
		//draw the tail if the width is an odd number
		if (width%2 == 1)
		{
			draw(tail);
			skipSpaces(width-1);
			draw();
			skipLines(1);
		}
		
		//draw the triangle below the tail
		for(int i=(width/2-1); i>=0; i-- )
		{
			skipSpaces(tail-1);
			draw();
			if (i != 0)
			{
				skipSpaces(2*i);
				draw();
			}
			skipLines(1);
		}
	}
}