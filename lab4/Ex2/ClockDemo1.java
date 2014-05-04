public class ClockDemo1
{
	public static void main(String[] args)
	{
		//build a new clock
		ClockDisplay1 clock = new ClockDisplay1(23,59,59);
		System.out.println(clock);
		
		//increment to next day
		clock.incrementSecond();
		System.out.println(clock);
		
		//increment by second to next minute
		for(int i=1; i<=59; i++)
			clock.incrementSecond();
		System.out.println("\n"+clock);
		clock.incrementSecond();
		System.out.println(clock);
		
		//increment by minute to next hour
		for(int i=1; i<=58; i++)
			clock.incrementMinute();
		System.out.println("\n"+clock);
		clock.incrementMinute();
		System.out.println(clock);
		
		//increment by hour
		for(int i=1; i<=22; i++)
			clock.incrementHour();
		System.out.println("\n"+clock);
		clock.incrementHour();
		System.out.println(clock);
	
	}
}