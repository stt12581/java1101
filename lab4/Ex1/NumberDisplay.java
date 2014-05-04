public class NumberDisplay
{
		private int limit;
		private int value;

		public NumberDisplay(int rollOverLimit)
		{
			limit = rollOverLimit;
			value = 0;
		}
		public void increment()
		{
			value = (value + 1)%limit;
		}
		//get and set value
		public int getValue()
		{
			return value;
		}
		public void setValue(int replacementValue)
		{
			if ((replacementValue>=0)&&(replacementValue<limit))
				value = replacementValue;
		}
		public String toString()
		{
			if (value<10)
				return "0" + value;
			else
				return "" + value;
		}

}
