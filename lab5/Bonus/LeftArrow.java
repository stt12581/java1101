public class LeftArrow extends ShapeBasics
{
	private int tail;
	private int width;
	
	public LeftArrow(int t, int w)
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
	
	//draw the left arrow
	public void drawLeft()
	{
		//draw the triangle above the tail
		for(int i=0; i<(width/2); i++ )
		{
			skipSpaces(width-1-2*i);
			draw();
			if (i != 0)
			{
				skipSpaces(2*i-1);
				draw();
			}
			skipLines(1);
		}
		
		//draw the tail if the width is an odd number
		if (width%2 == 1)
		{
			draw();
			skipSpaces(width-2);
			draw(tail);
			skipLines(1);
		}
		
		//draw the triangle below the tail
		for(int i=(width/2-1); i>=0; i-- )
		{
			skipSpaces(width-1-2*i);
			draw();
			if (i != 0)
			{
				skipSpaces(2*i-1);
				draw();
			}
			skipLines(1);
		}
	}
}