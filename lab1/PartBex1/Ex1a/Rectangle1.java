public class Rectangle1
{
	private int length;
	private int width;

	public Rectangle()
	{
	}
	public void setLength(int l)
	{
		length = l;
	}
	public void setWidth(int w)
	{
		width = w;
	}
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public int findArea()
	{
		return length*width;
	}
}