public class PizzaStand
{
	private int ID;
	private int sold;
	private static int totalPizza=0;
	private static double cost;
	public PizzaStand(int ID, int sale)
	{
		this.ID=ID;
		sold=0;
		while (sale>sold)
			sold++;
		totalPizza += sold; 
	}
	public void justSold()
	{
		sold++;
	}
	public int sold()
	{
		return sold;
	}
	public static void setCost()
	{
		cost=5;
	}
	
	//get total number of sold pizza and total money
	public static int getTotalPizza()
	{
		return totalPizza;
	}
	public static double getTotalSold()
	{
		setCost();
		return totalPizza*cost;
	}
	public String toString()
	{
		return ID+"      "+sold;
	}
}
