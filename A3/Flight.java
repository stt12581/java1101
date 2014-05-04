public class Flight
{	
	private String line;
	private String id;
	private Seat[][] seat;
	private String orig, dest;
	
	//constructor
	public Flight(String l, String id, String o, String d)
	{
		line = l;
		this.id = id;
		orig = o;
		dest = d;
	}
	
	//set and get methods
	public void setLine(String l)
	{
		line = l;
	}
	public void setID(String id)
	{
		this.id = id;
	}
	
	public void setOrig(String o)
	{
		orig = o;
	}
	public void setDest(String d)
	{
		dest = d;
	}
	
	public String getLine()
	{
		return line;
	}
	public String getId()
	{
		return id;
	}
	public String getOrig()
	{
		return orig;
	}
	public String getDest()
	{
		return dest;
	}
	public Seat getSeat(int i, int j)
	{
		return seat[i][j];
	}
	
	//create seat and book seat
	public void createSeat(int row)
	{
		seat = new Seat[row][6];
		
		for (int i = 0; i < row; i++)
			for (int j = 0; j < 6; j++)
				seat[i][j] = new Seat(i, (char)(j + 65));
	}
	
	public void bookSeat(int row, char col)
	{
		if (row > seat.length || col > 70 || col < 65)
			System.out.printf("Seat (%d,%c) is invaild.\n",row,col);
		else{
			if(!seat[row-1][(int)col - 65].getStatus())
				seat[row-1][(int)col - 65].setStatus();
			else
				System.out.printf("Seat (%d,%c) has been reserved.\n",row,col);
		}
	}
	
	//toString method
	public String toString()
	{
		String seats = "";
		if (seat != null){
			for (int i = 0; i < seat.length; i++)
				for (int j = 0; j < seat[i].length; j++)
					if (seat[i][j].getStatus())
						seats += seat[i][j].toString()+"\t";
		}
		else
			seats = "None";
		if (seats.equals(""))
			seats = "Not reserved";
		return "Airline: "+line+"      Flight ID: "+id+"     Originating Airport: "+orig+"     Destination Airpot: "+dest+"    Reserved seat: "+seats;
	}
}
		