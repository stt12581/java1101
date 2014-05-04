public class Point
{
		private int x;
		private int y;
		
		public Point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		//set and get the position of point
		public void setX(int xpos)
		{
			x = xpos;
		}
		public void setY(int ypos)
		{
			y = ypos;
		}
		public int getX()
		{
			return x;
		}
		public int getY()
		{
			return y;
		}
		//find the distance
		public double distanceFrom(Point other)
		{
			int root = (x-other.getX())*(x-other.getX())+(y-other.getY())*(y-other.getY());
			return Math.pow(root,0.5);
		}
		public String toString()
		{
			return "("+x+","+y+")";
		}
		
}