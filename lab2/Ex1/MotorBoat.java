//MotorBoat.java
public class MotorBoat
{
	//instance variables
	private double amount;
	private double speed;
	private double rate;
	
	//constructors
	public MotorBoat(double amount, double rate)
	{
		this.amount = amount;
		this.rate = rate;
		speed = 0;
	}
	
	//set and get methods
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	public void setRate(double rate)
	{
		this.rate = rate;
	}
	
	public double getAmount()
	{
		return amount;
	}
	public double getSpeed()
	{
		return speed;
	}
	public double getRate()
	{
		return rate;
	}
	//other methods
	public String toString()
	{
		return "\n\nFuel in tank: "+amount+" liters \nCurrent speed: "+speed+" km per hour \nRate: "+rate+" liters per km";
	}
	public String changeSpeed(double cSpeed)
	{
		speed += cSpeed;
		return "Current speed: "+speed;
	}
	public String travel(double time)
	{	
		double distance = time/60*speed;
		amount = amount - rate*distance;
		return "\nDistance travelled: "+String.format("%.1f", distance)+"\n"+toString();
	}
	public void refuel(double refuel)
	{
		amount += refuel;
	}
}