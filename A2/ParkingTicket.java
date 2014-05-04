public class ParkingTicket
{
	private ParkingMeter meter;
	private int fine;
	private String name;
	private int number;

	//constructor to get connect to parkingmeter and policeoffic
	public ParkingTicket(ParkingMeter m, PoliceOffice office)
	{
		meter = m;
		name = office.getName();
		number = office.getBadgenum();
	}
	
	//getFine method give the way to compute fine
	public int getFine(ParkingMeter m)
	{
		if ( m.getExceed()%60 == 0 )
			fine = 25 + (m.getExceed() / 60 -1) *10;
		else
			fine = 25+  (m.getExceed() / 60) *10;
		return fine;
	}
	
	//print all the information if the car has parkingTicket
	public String toString()
	{
		getFine(meter);
		return meter+"\nFine: $"+fine+"\nOfficer Name: "+name+"\tNumber: "+number;
	}
	
		
}