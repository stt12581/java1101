public class PoliceOffice
{
	private String name;
	private int badgenum;
	private ParkingMeter meter;
	
	//policeOffice constructor
	public PoliceOffice(ParkingMeter m, String n, int b)
	{
		meter = m;
		name = n;
		badgenum = b;
	}
	
	//get methods
	public String getName()
	{
		return name;
	}
	public int getBadgenum()
	{
		return badgenum;
	}
	
	//check if time is expired
	public boolean isExpired (ParkingMeter m)
	{
		return (m.getExceed() >0);
	}
	
	//generate ticket if time is expired
	public ParkingTicket generate(ParkingMeter m)
	{
		if (isExpired(m))
		{
			ParkingTicket ticket = new ParkingTicket(meter, this);
			return ticket;
		}
		else
			return null;
	}

}