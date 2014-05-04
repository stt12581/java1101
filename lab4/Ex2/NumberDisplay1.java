public class NumberDisplay1
{
		private int limit;
		private int value;
		private static int ampm=1;

		public NumberDisplay1(int rollOverLimit)
		{
			limit = rollOverLimit;
			value = 0;
		}
		public void increment()
		{
			value = (value + 1)%limit;
		}
		//method for hour increment. 12 can also be written as limit
		public void hourIncrement()
		{
			if (value+1 != (value + 1)%12 )
				ampm *= -1;

			if ((value+1)%12 != 0)
				value = (value + 1)%12;
			else
				value = 12;
		}
		public static int getAmpm()
		{
			return ampm;
		}
		//get and set time value
		public int getValue()
		{
			return value;
		}
		public void setValue(int replacementValue)
		{
			if ((replacementValue>=0)&&(replacementValue<=limit))
				value = replacementValue;
			else
				value = replacementValue%limit;
		}
		public void setHourvalue()
		{
			value = 12;
		}
		public String toString()
		{
			if (value<10)
				return "0" + value;
			else
				return "" + value;
		}

}