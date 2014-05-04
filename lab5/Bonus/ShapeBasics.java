public class ShapeBasics
{
		//offset indicates how far it is indented from the left
		//edge of the screen
		private int offset;
		// shape character
		public final static char SHAPE_CHAR = '*';

		public ShapeBasics()
		{
			offset=0;
		}
		public ShapeBasics(int offset)
		{
			this.offset = offset;
		}
		public void setOffset(int offset)
		{
			this.offset = offset;
		}
		public int getOffset()
		{
			return this.offset;
		}
		//static method skipLines skips the given number of lines
		//down from the current one
		public static void skipLines(int numLines)
		{
			for(int i=0; i<numLines; i++)
				System.out.println();
		}
		//static method skipSpaces that skips the given number of spaces
		public static void skipSpaces(int numSpaces)
		{
			for(int i = 0; i<numSpaces; i++)
				System.out.print(' ');
		}
		//method draw draws a single star
		public static void draw()
		{
			System.out.print(SHAPE_CHAR);
		}
		//method draw(num) draws a given number of shapes
		public static void draw(int numShapes)
		{
			for(int i = 0; i < numShapes; i++)
				draw();
		}
		//method drawHere draws the shape beginning at the current line
		public void drawWithOffset()
		{
			skipSpaces(offset);
			draw();
		}
		//method drawHere draws the given # of shapes beginning at current line
		public void drawWithOffset(int numShapes)
		{
			skipSpaces(offset);
			draw(numShapes);
		}
}
