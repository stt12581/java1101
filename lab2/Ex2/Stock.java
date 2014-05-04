//Stock.java
public class Stock
{
	//instance variables
	private String symbol;
	private double price;
	private int shares;
	
	//constructors
	public Stock(String symbol, double price, int shares)
	{
		this.symbol = symbol;
		this.price = price;
		this.shares = shares;
	}
	
	//set and get methods
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}
	public void setPrice(double Price)
	{
		this.price = price;
	}
	public void setShares(int shares)
	{
		this.shares = shares;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	public double getPrice()
	{
		return price;
	}
	public int getShares()
	{
		return shares;
	}
	
	//other methods
	
	//print the information
	public String toString()
	{
		return "Stock: "+symbol+"\nPrice: "+price+"\nShares: "+shares;
	}
	//compare the value
	public int compare(Stock s)
	{	
		double value1 = s.getPrice()*s.getShares();
		double value2 = price*shares;
		if (value1> value2)
			return +1;
		else if (value1< value2)
			return -1;
		else
			return 0;
	}
}