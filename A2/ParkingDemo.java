public class ParkingDemo
{
	public static void main(String[] args)
	{
		//create a parkedCar object and then it has meter, officer object. And when the time is expired, it creates a ticket
		ParkedCar car1 = new ParkedCar("wer","mode","blue", 1249);
		ParkingMeter meter = new ParkingMeter(car1, 50);
		PoliceOffice officer = new PoliceOffice(meter, "Mary", 0053);
		meter.elapse(250);
		meter.increasePurchase(100);
		
		ParkingTicket ticket = officer.generate(meter);
		System.out.println(ticket);
		
		//create another meter object if it has no car
		ParkingMeter meterNull = new ParkingMeter();
		System.out.println("\n"+meterNull);
	}
}