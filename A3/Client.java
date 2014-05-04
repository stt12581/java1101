public class Client
{
	public static void main (String[] args)
	{
		SystemManager res = new SystemManager();

		//create airports
		res.createAirport("YHZ");
		res.createAirport("R34");//invalid
		res.createAirport("bei");
		res.createAirport("JFK");
		res.createAirport("YYC");
		res.createAirport("BEIJING");	//invalid
		res.createAirport("123");//invalid
		res.createAirport("YEG");

		//create airlines
		res.createAirline("AC");
		res.createAirline("CA");
		res.createAirline("HNAIR");
		res.createAirline("WSJET");
		res.createAirline("FRONTIER"); //invalid

		//create flights
		res.createFlight("AC", "YHZ", "JFK", "3867");
		res.createFlight("CA", "YEG", "YYC", "567");
		res.createFlight("HNAIR", "YHZ", "JFK", "3867");
		res.createFlight("AC", "YYC", "YHZ", "3867");//invalid. same ID for the same airline
		res.createFlight("HNAIR", "YEG", "YEG", "3579");//invalid. Airport is the same
		res.createFlight("WSJET", "YHZ", "BOS", "3867");


		//find available flights
		res.findAvailableFlights("YHZ", "JFK");


		//create seats
		res.createSeats("AC", "3867", 40);
		res.createSeats("HNAIR", "7842", 25);//invalid-7842 not created
		res.createSeats("WSJET", "3867", 36);
		

	
		//book seats
		res.bookSeat("AC", "3867", 15, 'C');
	   res.bookSeat("AC", "3867", 20, 'N');   //invalid - N doesn't exist
	  	res.bookSeat("WSJET", "2671", 2, 'F');		// invalid - 2671 not created
	   res.bookSeat("AC", "3867", 78, 'C');		// invalid - row 78 doesn't exist

		//display system details
		res.displaySystemDetails();
	}
}
