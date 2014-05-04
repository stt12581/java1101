public class ClockDisplay1
{
		private NumberDisplay1 hours;
		private NumberDisplay1 minutes;
		private NumberDisplay1 seconds;
		private String displayString;
		
		public ClockDisplay1()
		{
			hours = new NumberDisplay1(12);
			minutes = new NumberDisplay1(60);
			seconds = new NumberDisplay1(60);
			updateDisplay();
		}
		public ClockDisplay1(int hour, int minute, int second)
		{
			hours = new NumberDisplay1(12);
			minutes = new NumberDisplay1(60);
			seconds = new NumberDisplay1(60);
			setTime(hour, minute, second);
			updateDisplay();
		}
		//increment minute
		public void incrementMinute()
		{
			minutes.increment();
			if (minutes.getValue()==0)
				hours.hourIncrement();
			updateDisplay();
		}
		//increment second and increment minute if second reach 60
		public void incrementSecond()
		{
			seconds.increment();
			if (seconds.getValue()==0)
			{
				minutes.increment();
				if (minutes.getValue()==0)
					hours.hourIncrement();
			}
			updateDisplay();
		}
		//increment hour
		public void incrementHour()
		{
			hours.hourIncrement();
			updateDisplay();
		}
		public void setTime(int hour, int minute, int second)
		{
			hours.setValue(hour);
			minutes.setValue(minute);
			seconds.setValue(second);
		}
		public String toString()
		{
			return displayString;
		}
		private void updateDisplay()
		{
			String ampm;
			if (NumberDisplay1.getAmpm()==1)
				ampm = "AM";
			else 
				ampm = "PM";
				
			displayString = hours + ":" + minutes+ ":" +seconds+ampm;
		}	
}
