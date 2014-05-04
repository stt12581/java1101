public class ClockDemo
{
	public static void main(String[] args)
	{
		//build a new clock
		ClockDisplay clock = new ClockDisplay(23,59,00);
		System.out.println(clock);
		
		//increment into next day
		clock.incrementMinute();
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
		for(int i=1; i<=6; i++)
			clock.incrementHour();
		System.out.println("\n"+clock);
		clock.incrementHour();
		System.out.println(clock);
	}
}
