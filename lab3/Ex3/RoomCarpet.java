public class RoomCarpet
{
	private RoomDimension size;
	private double carpetCost;

	public RoomCarpet(RoomDimension dim, double cost)
	{
		size = dim;
		carpetCost = cost;
	}
	
	//get total cost
	public double getTotalCost()
	{
		return size.getArea()*carpetCost;
	}
	public String toString()
	{
		return "The total cost of the room \n"+size+"\nis "+getTotalCost();
	}
}
