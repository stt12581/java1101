public class Sales
{
	private String name;
	private double cost;
	private int quantity;
	private int discount;
	private int number;
	private double amount;
	private double totaldiscount;
	
	public Sales(double cost, int quantity, int discount)
	{
		this.cost = cost;
		this.quantity = quantity;
		this.discount = discount;
	}
	
	public void setName(String name)//set each parameters
	{
		this.name = name;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public void setDiscount(int discount)
	{
		this.discount = discount;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}

	public String getName()//get each parameter
	{
		return name;
	}
	public double getCost()
	{
		return cost;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public int getDiscount()
	{
		return discount;
	}
	public int getNumber()
	{
		return number;
	}

	public void registerSale(int n)//count the discount
	{
		if(n> quantity)
			totaldiscount = cost*number*discount*0.01;
		else
			totaldiscount = 0;
	}
	
	public String displaySales()//print all the information
	{
		return "Item: "+name+"\nNumber sold: "+number+"\nTotal amount: $"+(number*cost-totaldiscount)+"\nTotal discount: $"+totaldiscount;
	}
}