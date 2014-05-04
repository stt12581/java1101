public class Dictionary extends Book
{
	private int numDefinitions;
	
	public Dictionary(int p, int d)
	{
		super(p);
		numDefinitions = d;
	}
	
	//set and get methods
	public void setDefinitions(int n)
	{
		numDefinitions = n;
	}
	public int getDefinitions()
	{
		return numDefinitions;
	}
	//compute the ratio
	public int computeRatio()
	{
		return numDefinitions/getPages();
	}
	
	//toString method
	public String toString()
	{
		return "The book has "+getPages()+" pages and has "+getDefinitions()+" definitions. \nIt has "+computeRatio()+" definitions per page.";
	}
}
