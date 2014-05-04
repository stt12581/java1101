public class ClockDisplay
{
		private NumberDisplay hours;
		private NumberDisplay minutes;
		private NumberDisplay seconds;
		private String displayString;
		
		public ClockDisplay()
		{
			hours = new NumberDisplay(24);
			minutes = new NumberDisplay(60);
			seconds = new NumberDisplay(60);
			updateDisplay();
		}
		public ClockDisplay(int hour, int minute, int second)
		{
			hours = new NumberDisplay(24);
			minutes = new NumberDisplay(60);
			seconds = new NumberDisplay(60);
			setTime(hour, minute, second);
		}
		//increment minute
		public void incrementMinute()
		{
			minutes.increment();
			if (minutes.getValue()==0)
				hours.increment();
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
					hours.increment();
			}
			updateDisplay();
		}
		//increment hour
		public void incrementHour()
		{
			hours.increment();
			updateDisplay();
		}
		public void setTime(int hour, int minute, int second)
		{
			hours.setValue(hour);
			minutes.setValue(minute);
			seconds.setValue(second);
			updateDisplay();
		}
		public String toString()
		{
			return displayString;
		}
		private void updateDisplay()
		{
			displayString = hours + ":" + minutes+ ":" +seconds;
		}
		
		
}
