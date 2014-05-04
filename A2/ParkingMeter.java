public class ParkingMeter
{
	private ParkedCar car;
	private int minuteBuy;
	private int minuteExceed=0;
	
	//give two constructors. One is parkingmeter has a car, the other is parkingmeter is empty
	public ParkingMeter(ParkedCar c, int buy)
	{
		car = c;
		minuteBuy = buy;
	}
	
	public ParkingMeter()
	{
		car=null;
		minuteBuy=0;
		minuteExceed=0;
	}
	
	public int getBuy()
	{
		return minuteBuy;
	}
	public int getExceed()
	{
		return minuteExceed;
	}
	
	//when buy more parking time, it should first count down the exceed time and then add up the buy time.
	public void increasePurchase(int newBuy)
	{
		minuteBuy += newBuy;
		if (minuteExceed > 0)
			if(minuteBuy > minuteExceed)
			{
				minuteBuy -= minuteExceed;
				minuteExceed = 0;
			}
			else
				minuteExceed -= minuteBuy; 
				minuteBuy = 0;
	}
	
	//elapse method to change minuteExceed and buy after parking
	public void elapse(int elapse)
	{
		if (minuteBuy > elapse)
			minuteBuy -= elapse;
		else
			minuteExceed += elapse - minuteBuy;
			minuteBuy = 0;
	}
	
	public String toString()
	{
		if ( car == null )
			return "Car: none";
		else
			return car+"\nExceed time: "+ minuteExceed;
	}

	
}